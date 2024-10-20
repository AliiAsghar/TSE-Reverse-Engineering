package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afre extends afqy {
    private static final alvi ag = alvi.m("com/google/android/libraries/compose/magiccompose/ui/screen/MagicComposeScreen");
    public Optional a;
    private final agek ah;
    public afjn b;
    public ComposeView c;
    public anib d;
    public adef e;

    public afre() {
        super(Integer.valueOf(R.layout.magic_compose_screen), new afqz((ascd) null, 3));
        this.ah = agek.h;
    }

    public static final /* synthetic */ afqz o(afre afreVar) {
        return (afqz) afreVar.bj();
    }

    @Override // defpackage.agem
    public final agek aM() {
        return this.ah;
    }

    @Override // defpackage.agem
    public final void aX() {
        Object c;
        ((afrh) ((afqz) bj()).a.c()).c.a();
        ascd ascdVar = ((afqz) bj()).a;
        do {
            c = ascdVar.c();
        } while (!ascdVar.g(c, afrh.a((afrh) c, arnv.a, 0, 65534)));
    }

    @Override // defpackage.agem
    public final void aY() {
        arrn.J(bo(), null, null, new afbh(this, (arpe) null, 9), 3);
    }

    @Override // defpackage.cg
    public final void ag(View view, Bundle bundle) {
        view.getClass();
        this.c = (ComposeView) view.findViewById(R.id.screen_content_compose_view);
        bh().d("MagicComposeScreen#onViewCreated", new afpw(this, 3));
    }

    public final afjn e() {
        afjn afjnVar = this.b;
        if (afjnVar != null) {
            return afjnVar;
        }
        arro.b("styleUsageProcessor");
        return null;
    }

    @Override // defpackage.afqy, defpackage.agai, defpackage.cg
    public final void f(Context context) {
        super.f(context);
        adef adefVar = this.e;
        if (adefVar == null) {
            arro.b("styleUsageProcessorFactory");
            adefVar = null;
        }
        this.b = adefVar.e(new afka(31));
        bh().d("MagicComposeScreen#onAttach", new afpw(this, 2));
    }

    @Override // defpackage.cg
    public final void l() {
        super.l();
        ((afrh) ((afqz) bj()).a.c()).d.a();
    }

    public final Optional p() {
        Optional optional = this.a;
        if (optional != null) {
            return optional;
        }
        arro.b("magicComposeViewFactory");
        return null;
    }

    public final void q(anib anibVar) {
        Object c;
        int indexOf = ((afrh) ((afqz) bj()).a.c()).g.indexOf(anibVar);
        if (indexOf < 0) {
            ((alvg) ag.i().h("com/google/android/libraries/compose/magiccompose/ui/screen/MagicComposeScreen", "setInitialStyle", 96, "MagicComposeScreen.kt")).t("MagicRewriteStyle '%s' not found", anibVar);
        }
        ascd ascdVar = ((afqz) bj()).a;
        do {
            c = ascdVar.c();
        } while (!ascdVar.g(c, afrh.a((afrh) c, null, Math.max(indexOf, 0), 49151)));
    }

    @Override // defpackage.ageb
    public final agea r() {
        return null;
    }
}
