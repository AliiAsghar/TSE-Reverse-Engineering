package defpackage;

import com.google.android.apps.messaging.R;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aghf {
    public final afvc a;
    public final Duration b;
    public final jvo d;
    public final jvw e;
    private final int f = R.string.audio_recording_start_failed;
    private final int g = R.string.audio_recording_error;
    private final Integer h = null;
    private final Integer i = null;
    private final boolean j = false;
    public final Duration c = null;

    public aghf(afvc afvcVar, jvo jvoVar, jvw jvwVar, Duration duration) {
        this.a = afvcVar;
        this.d = jvoVar;
        this.e = jvwVar;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aghf)) {
            return false;
        }
        aghf aghfVar = (aghf) obj;
        if (!d.F(this.a, aghfVar.a) || !d.F(this.d, aghfVar.d) || !d.F(this.e, aghfVar.e)) {
            return false;
        }
        int i = aghfVar.f;
        int i2 = aghfVar.g;
        Integer num = aghfVar.h;
        if (!d.F(null, null)) {
            return false;
        }
        Integer num2 = aghfVar.i;
        if (!d.F(null, null)) {
            return false;
        }
        boolean z = aghfVar.j;
        if (!d.F(this.b, aghfVar.b)) {
            return false;
        }
        Duration duration = aghfVar.c;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + R.string.audio_recording_start_failed) * 31) + R.string.audio_recording_error) * 29791) + 1237) * 31) + this.b.hashCode()) * 31;
    }

    public final String toString() {
        return "VoiceRecordingConfiguration(outputFileProvider=" + this.a + ", encoding=" + this.d + ", eventObserver=" + this.e + ", recordingStartErrorMessage=2132017444, recordingErrorMessage=2132017442, recordingStartedSound=null, recordingStoppedSound=null, enableSavingAudioLevels=false, minimumAttachmentDuration=" + this.b + ", audioLevelPollInterval=null)";
    }
}
