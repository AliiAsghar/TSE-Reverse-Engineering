package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afss implements afsw {
    public static final afss a = new afss();

    private afss() {
    }

    @Override // defpackage.afsw
    public final int a() {
        return R.string.audio_format_type;
    }

    @Override // defpackage.afsw
    public final String b() {
        return "audio";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afss)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1208579796;
    }

    public final String toString() {
        return "Audio";
    }
}
