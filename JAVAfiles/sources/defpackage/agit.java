package defpackage;

import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agit extends agil {
    public static final alvi a = alvi.m("com/google/android/libraries/compose/voice/ui/screen/VoiceScreen");
    private ComposeView ag;
    private final arml ah;
    private arxm ai;
    public AudioManager b;
    public agje c;
    public aiim d;
    private final agek e;

    public agit() {
        super(Integer.valueOf(R.layout.voice_screen));
        this.e = agek.g;
        this.ah = armd.a(new agef(this, 11));
    }

    public static /* synthetic */ void aZ(agit agitVar, int i, int i2, View.OnClickListener onClickListener) {
        ComposeView composeView = null;
        aiim.v(agitVar.bc(), Integer.valueOf(i), null, Integer.valueOf(i2), onClickListener);
        ComposeView composeView2 = agitVar.ag;
        if (composeView2 == null) {
            arro.b("contentComposeView");
        } else {
            composeView = composeView2;
        }
        composeView.setVisibility(8);
    }

    private final aiim bc() {
        return (aiim) this.ah.a();
    }

    public static final /* synthetic */ agip e(agit agitVar) {
        return (agip) agitVar.bj();
    }

    @Override // defpackage.agem
    public final agek aM() {
        return this.e;
    }

    public final void aP() {
        bc().l();
        ComposeView composeView = this.ag;
        if (composeView == null) {
            arro.b("contentComposeView");
            composeView = null;
        }
        composeView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agem
    public final void aT(afzr afzrVar) {
        bc().m(afzrVar.h, afzrVar.i);
    }

    public final void aW() {
        aP();
        aghw aghwVar = new aghw(((agip) bj()).e, 3);
        ComposeView composeView = this.ag;
        if (composeView == null) {
            arro.b("contentComposeView");
            composeView = null;
        }
        composeView.a(new cdj(-2005834357, true, new aezg(this, aghwVar, 16)));
        if (this.ai == null) {
            this.ai = arrn.J(bo(), null, null, new aghm(this, (arpe) null, 6, (char[]) null), 3);
        }
    }

    @Override // defpackage.agem
    public final void aX() {
        boolean z;
        agih agihVar = ((agip) bj()).c;
        Object c = ((agip) bj()).a.c();
        agir agirVar = agiq.b;
        aggp aggpVar = (aggp) q().g.c();
        if (c != agirVar) {
            z = true;
        } else {
            z = false;
        }
        agiz.l(agihVar, z, false, aggpVar, 2);
        if (((agip) bj()).i) {
            agje q = q();
            q.b();
            q.b.c(true);
        }
        arxm arxmVar = this.ai;
        if (arxmVar != null) {
            arxmVar.v(null);
        }
        ComposeView composeView = null;
        this.ai = null;
        ComposeView composeView2 = this.ag;
        if (composeView2 == null) {
            arro.b("contentComposeView");
        } else {
            composeView = composeView2;
        }
        composeView.f();
    }

    @Override // defpackage.agem
    public final void aY() {
        AudioManager audioManager = this.b;
        if (audioManager == null) {
            arro.b("audioManager");
            audioManager = null;
        }
        int mode = audioManager.getMode();
        if (mode != 2 && mode != 3) {
            arrn.J(bo(), null, null, new aghm(this, (arpe) null, 5, (byte[]) null), 3);
        } else {
            ((alvg) a.g().h("com/google/android/libraries/compose/voice/ui/screen/VoiceScreen", "onOpen", 70, "VoiceScreen.kt")).q("Cannot record audio while a call is in progress.");
            aZ(this, R.string.voice_recording_call_in_progress_description, R.string.start_recording_when_call_end, new acah(this, 19));
        }
    }

    @Override // defpackage.cg
    public final void aa() {
        super.aa();
        agje q = q();
        q.b();
        aggk aggkVar = (aggk) q.b;
        aggkVar.f();
        aggkVar.e().release();
        aggkVar.b.f(false);
        aggkVar.c.f(false);
    }

    @Override // defpackage.cg
    public final void ag(View view, Bundle bundle) {
        view.getClass();
        this.ag = (ComposeView) view.findViewById(R.id.screen_content_compose_view);
        by();
        bs();
    }

    public final aiim bb() {
        aiim aiimVar = this.d;
        if (aiimVar != null) {
            return aiimVar;
        }
        arro.b("permissionsManager");
        return null;
    }

    public final agje q() {
        agje agjeVar = this.c;
        if (agjeVar != null) {
            return agjeVar;
        }
        arro.b("uiAdapter");
        return null;
    }

    @Override // defpackage.ageb
    public final agea r() {
        return null;
    }
}
