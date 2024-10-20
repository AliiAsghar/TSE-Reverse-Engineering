package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.widget.Toast;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jvs {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceInputUiAdapter");
    public final arwe b;
    public final armf c;
    public final AudioManager d;
    public final yjf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final lkd j;
    public final kjp k;
    public final hmk l;
    private final arpi m;
    private final arml n;

    public jvs(arwe arweVar, arpi arpiVar, armf armfVar, hmk hmkVar, AudioManager audioManager, yjf yjfVar, lkd lkdVar, kjp kjpVar, @nie armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        arweVar.getClass();
        arpiVar.getClass();
        armfVar.getClass();
        audioManager.getClass();
        yjfVar.getClass();
        lkdVar.getClass();
        kjpVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        this.b = arweVar;
        this.m = arpiVar;
        this.c = armfVar;
        this.l = hmkVar;
        this.d = audioManager;
        this.e = yjfVar;
        this.j = lkdVar;
        this.k = kjpVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.h = armfVar4;
        this.i = armfVar5;
        this.n = armd.a(new juf(this, 3));
    }

    private final agih i() {
        return (agih) this.n.a();
    }

    public final aeph a() {
        if (!((Boolean) this.f.b()).booleanValue()) {
            return null;
        }
        return new aeph(new rl(this, 17, (boolean[][][]) null), new rl(this, 18, (float[][][]) null), new rl(this, 19, (byte[]) null, (byte[]) null));
    }

    public final aepo b(Integer num) {
        if (num != null) {
            return new aepo(num.intValue(), new jvq(this, 0));
        }
        return null;
    }

    public final arwl c(Context context) {
        return arrn.I(this.b, this.m, null, new jvr(this, context, (arpe) null, 2, (byte[]) null), 2);
    }

    public final void d() {
        alvw d = a.d();
        d.X(alwp.a, "BugleComposeRow2");
        ((alvg) d.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceInputUiAdapter", "onPressReleased", 156, "VoiceInputUiAdapter.kt")).q("Voice input press released");
        i().d(null);
    }

    public final void e(Context context) {
        alvw d = a.d();
        d.X(alwp.a, "BugleComposeRow2");
        ((alvg) d.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceInputUiAdapter", "onSwipeToCancelRecording", 162, "VoiceInputUiAdapter.kt")).q("Voice input swipe to cancel");
        g(context, R.string.audio_recorder_recording_cancelled_text);
        agiz.l(i(), false, false, null, 6);
    }

    public final void f(Context context) {
        alvw d = a.d();
        d.X(alwp.a, "BugleComposeRow2");
        ((alvg) d.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceInputUiAdapter", "onSwipeUp", 186, "VoiceInputUiAdapter.kt")).q("Voice input swipe up");
        jvw jvwVar = (jvw) this.c.b();
        if (!jvwVar.i()) {
            jvwVar.j = 4;
            qjh.l(this.b, this.m, new jvr(this, context, (arpe) null, 3, (char[]) null), 2);
            jvwVar.g();
        }
    }

    public final void g(Context context, int i) {
        Toast.makeText(context, context.getString(i), 0).show();
    }

    public final Object h(Context context, int i, arpe arpeVar) {
        return arro.q(this.m, new mdi(this, context, i, (arpe) null, 1), arpeVar);
    }
}
