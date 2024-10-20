package defpackage;

import android.R;
import android.content.Intent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryBrowserActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aasb extends aasc implements ajyk {
    public final GalleryBrowserActivity a;
    public rg b;
    private final armf d;

    public aasb(GalleryBrowserActivity galleryBrowserActivity, ajxd ajxdVar, armf armfVar) {
        this.a = galleryBrowserActivity;
        this.d = armfVar;
        ajxdVar.c(this);
    }

    @Override // defpackage.ajyk
    public final void b(ajxt ajxtVar) {
        ((kpw) this.d.b()).a(ajxtVar);
    }

    @Override // defpackage.ajyk
    public final void d(agxw agxwVar) {
        ajwt n = agxwVar.n();
        aozy createBuilder = aary.a.createBuilder();
        long j = ((aapj) this.a).D;
        Long.valueOf(j).getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ((aary) apagVar).b = j;
        boolean z = ((aapj) this.a).E;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((aary) createBuilder.b).c = z;
        aary aaryVar = (aary) createBuilder.s();
        aarl aarlVar = new aarl();
        apxh.e(aarlVar);
        aklw.b(aarlVar, n);
        aklt.a(aarlVar, aaryVar);
        bd bdVar = new bd(this.a.a());
        bdVar.v(R.id.content, aarlVar, "gallery_browser_fragment_tag");
        bdVar.b();
    }

    public final void e() {
        Intent intent = new Intent();
        intent.putExtra("attachment_queue_state_extra_key", ((aapj) this.a).C);
        this.a.setResult(-1, intent);
        this.a.finish();
    }

    @Override // defpackage.ajyk
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.ajyk
    public final /* synthetic */ void c() {
    }
}
