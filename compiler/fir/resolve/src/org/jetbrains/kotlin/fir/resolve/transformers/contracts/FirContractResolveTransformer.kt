/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.resolve.transformers.contracts

import org.jetbrains.kotlin.fir.FirSession
import org.jetbrains.kotlin.fir.resolve.ScopeSession
import org.jetbrains.kotlin.fir.resolve.transformers.body.resolve.*

open class FirContractResolveTransformer(
    session: FirSession,
    scopeSession: ScopeSession,
    outerBodyResolveContext: BodyResolveContext? = null
) : FirAbstractContractResolveTransformerDispatcher(
    session,
    scopeSession,
    outerBodyResolveContext,
) {
    final override val declarationsTransformer: FirDeclarationsResolveTransformer =
        FirDeclarationsContractResolveTransformer(this)
}
