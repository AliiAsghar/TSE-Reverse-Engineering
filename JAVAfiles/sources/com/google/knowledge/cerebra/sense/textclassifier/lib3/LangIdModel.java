package com.google.knowledge.cerebra.sense.textclassifier.lib3;

import defpackage.aovo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class LangIdModel implements AutoCloseable {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static final class LanguageResult {
        LanguageResult(String str, float f) {
        }
    }

    static {
        aovo.a();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    protected final void finalize() {
        try {
            throw null;
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    float getLangIdNoiseThreshold() {
        throw null;
    }

    int getMinTextSizeInBytes() {
        throw null;
    }
}
