package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.AudioButtonView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqj extends GestureDetector {
    final /* synthetic */ AudioButtonView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zqj(AudioButtonView audioButtonView, Context context, GestureDetector.OnGestureListener onGestureListener) {
        super(context, onGestureListener);
        this.a = audioButtonView;
    }

    @Override // android.view.GestureDetector
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        akrc b;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.a.a();
                        return true;
                    }
                } else {
                    AudioButtonView audioButtonView = this.a;
                    ahjj ahjjVar = audioButtonView.y;
                    if (ahjjVar != null && audioButtonView.f()) {
                        float rawX = motionEvent.getRawX();
                        motionEvent.getRawY();
                        zsh zshVar = (zsh) ahjjVar.a;
                        zshVar.a.getLocationOnScreen(zshVar.f);
                        if (!zshVar.k.A() ? rawX < zshVar.f[0] + (r2.getWidth() * zshVar.g) : rawX > zshVar.f[0] + (r2.getWidth() * (1.0f - zshVar.g))) {
                            b = ((aksr) ((zsh) ahjjVar.a).h.b()).b("VoiceMessagesUiController#onTouchMove");
                            try {
                                ((zsh) ahjjVar.a).b.a();
                                b.close();
                            } finally {
                            }
                        }
                    }
                }
            } else {
                akrc b2 = ((aksr) this.a.u.b()).b("AudioButtonView ACTION_UP");
                try {
                    AudioButtonView audioButtonView2 = this.a;
                    if (audioButtonView2.v == 2) {
                        audioButtonView2.c();
                    }
                    audioButtonView2.d(false);
                    b2.close();
                } finally {
                }
            }
        } else {
            b = ((aksr) this.a.u.b()).b("AudioButtonView ACTION_DOWN");
            try {
                AudioButtonView audioButtonView3 = this.a;
                if (!((yjf) audioButtonView3.m.b()).k()) {
                    xzb.j("Bugle", "Record audio permission not granted yet.");
                    ((yjl) audioButtonView3.n.b()).f(yjh.RECORD_AUDIO_PERMISSIONS, new zgs(audioButtonView3, 3));
                } else {
                    int mode = ((AudioManager) audioButtonView3.t.b()).getMode();
                    if (mode != 2 && mode != 3) {
                        audioButtonView3.c = false;
                        if (audioButtonView3.v == 1) {
                            audioButtonView3.g(2);
                            audioButtonView3.b(R.raw.audio_initiate, new zqk(audioButtonView3, 0));
                        }
                    }
                    xzb.j("Bugle", "Cannot record while call is in progress.");
                    audioButtonView3.q.k(R.string.audio_recorder_call_in_progress);
                }
                b.close();
            } finally {
                try {
                    b.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        }
        return true;
    }
}
