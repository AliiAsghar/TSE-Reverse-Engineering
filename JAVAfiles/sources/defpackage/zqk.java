package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.AudioButtonView;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqk implements ygn {
    public final /* synthetic */ AudioButtonView a;
    private final /* synthetic */ int b;

    public zqk(AudioButtonView audioButtonView, int i) {
        this.b = i;
        this.a = audioButtonView;
    }

    @Override // defpackage.ygn
    public final void a() {
        if (this.b != 0) {
            AudioButtonView audioButtonView = this.a;
            if (audioButtonView.v == 5) {
                audioButtonView.g(1);
                return;
            }
            return;
        }
        AudioButtonView audioButtonView2 = this.a;
        if (audioButtonView2.v == 2) {
            if (!audioButtonView2.h.e(audioButtonView2, audioButtonView2, audioButtonView2.e)) {
                this.a.q.k(R.string.audio_recording_start_failed);
                return;
            }
            AudioButtonView audioButtonView3 = this.a;
            audioButtonView3.a = audioButtonView3.f.f().toEpochMilli();
            this.a.g(3);
            AudioButtonView audioButtonView4 = this.a;
            int a = audioButtonView4.h.a(audioButtonView4.e) - this.a.getResources().getInteger(R.integer.audio_timer_warning_duration_seconds);
            AudioButtonView audioButtonView5 = this.a;
            audioButtonView5.d = audioButtonView5.l.schedule(new aidu(null, 18), a, TimeUnit.SECONDS);
            AudioButtonView audioButtonView6 = this.a;
            aktp.aa(audioButtonView6.d, new isn(this, 15), audioButtonView6.j);
        }
    }

    public /* synthetic */ zqk(AudioButtonView audioButtonView, int i, byte[] bArr) {
        this.b = i;
        this.a = audioButtonView;
    }
}
