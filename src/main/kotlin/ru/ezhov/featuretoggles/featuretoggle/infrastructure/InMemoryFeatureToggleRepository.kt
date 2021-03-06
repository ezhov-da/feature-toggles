package ru.ezhov.featuretoggles.featuretoggle.infrastructure

import arrow.core.Either
import org.springframework.stereotype.Repository
import ru.ezhov.featuretoggles.featuretoggle.domain.FeatureToggleRepository
import ru.ezhov.featuretoggles.featuretoggle.domain.FeatureToggleRepositoryException
import ru.ezhov.featuretoggles.featuretoggle.domain.model.FeatureToggle
import ru.ezhov.featuretoggles.featuretoggle.domain.model.FeatureToggleId

@Repository
class InMemoryFeatureToggleRepository : FeatureToggleRepository {
    private val map: MutableMap<String, FeatureToggle> = mutableMapOf()

    override fun all(): Either<FeatureToggleRepositoryException, List<FeatureToggle>> =
            Either.Right(map.values.toList())

    override fun byId(id: String): Either<FeatureToggleRepositoryException, FeatureToggle?> =
            Either.Right(map[id])

    override fun byName(name: String): Either<FeatureToggleRepositoryException, FeatureToggle?> =
            Either.Right(map.values.firstOrNull { f -> f.name == name })

    override fun save(featureToggle: FeatureToggle): Either<FeatureToggleRepositoryException, FeatureToggleId> {
        map[featureToggle.id.value] = featureToggle
        return Either.Right(featureToggle.id)
    }

    override fun delete(id: String): Either<FeatureToggleRepositoryException, Unit> {
        map.remove(id)
        return Either.Right(Unit)
    }
}