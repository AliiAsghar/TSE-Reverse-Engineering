package com.google.knowledge.cerebra.sense.textclassifier.lib3;

import defpackage.aovo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AnnotatorModel implements AutoCloseable {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static final class AnnotatedSpan {
        AnnotatedSpan(int i, int i2, ClassificationResult[] classificationResultArr) {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static final class AnnotationOptions {
        public int getAnnotateMode() {
            throw null;
        }

        public int getAnnotationUsecase() {
            throw null;
        }

        public String getDetectedTextLanguageTags() {
            throw null;
        }

        public String[] getEntityTypes() {
            throw null;
        }

        public String getLocale() {
            throw null;
        }

        public long getReferenceTimeMsUtc() {
            throw null;
        }

        public String getReferenceTimezone() {
            throw null;
        }

        public boolean getTriggerDictionaryOnBeginnerWords() {
            throw null;
        }

        public boolean getUsePodNer() {
            throw null;
        }

        public boolean getUseVocabAnnotator() {
            throw null;
        }

        public float getUserLocationAccuracyMeters() {
            throw null;
        }

        public double getUserLocationLat() {
            throw null;
        }

        public double getUserLocationLng() {
            throw null;
        }

        public boolean hasLocationPermission() {
            throw null;
        }

        public boolean hasPersonalizationPermission() {
            throw null;
        }

        public boolean isSerializedEntityDataEnabled() {
            throw null;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static final class Annotations {
        Annotations(AnnotatedSpan[][] annotatedSpanArr, ClassificationResult[] classificationResultArr) {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static final class ClassificationOptions {
        public int getAnnotationUsecase() {
            throw null;
        }

        public String getDetectedTextLanguageTags() {
            throw null;
        }

        public boolean getEnableAddContactIntent() {
            throw null;
        }

        public boolean getEnableSearchIntent() {
            throw null;
        }

        public String getLocale() {
            throw null;
        }

        public long getReferenceTimeMsUtc() {
            throw null;
        }

        public String getReferenceTimezone() {
            throw null;
        }

        public boolean getReturnEmptyClassificationResultForFailure() {
            throw null;
        }

        public boolean getTriggerDictionaryOnBeginnerWords() {
            throw null;
        }

        public boolean getUsePodNer() {
            throw null;
        }

        public boolean getUseVocabAnnotator() {
            throw null;
        }

        public String getUserFamiliarLanguageTags() {
            throw null;
        }

        public float getUserLocationAccuracyMeters() {
            throw null;
        }

        public double getUserLocationLat() {
            throw null;
        }

        public double getUserLocationLng() {
            throw null;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static final class ClassificationResult {
        public ClassificationResult(String str, float f, DatetimeResult datetimeResult, byte[] bArr, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, NamedVariant[] namedVariantArr, byte[] bArr2, RemoteActionTemplate[] remoteActionTemplateArr, long j, long j2, double d) {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static final class DatetimeResult {
        public DatetimeResult(long j, int i) {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static final class InputFragment {
        public float getBoundingBoxHeight() {
            throw null;
        }

        public float getBoundingBoxTop() {
            throw null;
        }

        public long getReferenceTimeMsUtc() {
            throw null;
        }

        public String getReferenceTimezone() {
            throw null;
        }

        public String getText() {
            throw null;
        }

        public boolean hasDatetimeOptions() {
            throw null;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static final class SelectionOptions {
        public int getAnnotationUsecase() {
            throw null;
        }

        public String getDetectedTextLanguageTags() {
            throw null;
        }

        public String getLocales() {
            throw null;
        }

        public boolean getUsePodNer() {
            throw null;
        }

        public boolean getUseVocabAnnotator() {
            throw null;
        }

        public float getUserLocationAccuracyMeters() {
            throw null;
        }

        public double getUserLocationLat() {
            throw null;
        }

        public double getUserLocationLng() {
            throw null;
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
}
