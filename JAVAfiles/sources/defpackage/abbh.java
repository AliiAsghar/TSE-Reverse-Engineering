package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.gms.gmscompliance.ui.UncertifiedDeviceActivity;
import com.google.android.libraries.stickers.gallery.StickerGalleryActivity;
import com.google.android.libraries.stickers.packdetails.PackDetailsActivity;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class abbh implements View.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public abbh(agwi agwiVar, Context context, int i) {
        this.c = i;
        this.b = context;
        this.a = agwiVar;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [ksm, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        agwi agwiVar;
        afnb afnbVar = null;
        switch (this.c) {
            case 0:
                ((ksm) ((abbj) this.a).h.b()).e((Context) this.b, (String) utw.T.e());
                return;
            case 1:
                lzv lzvVar = (lzv) ((abaa) this.a).a.b();
                Context context = (Context) this.b;
                akto.n(context, lzvVar.o(context));
                return;
            case 2:
                this.a.e((Context) this.b, "verified");
                return;
            case 3:
                abfs abfsVar = ((abft) this.a).k;
                Object obj = this.b;
                Context y = abfsVar.y();
                obj.getClass();
                zfh.r(y, (View) obj, zfh.p(y), y.getResources().getDimensionPixelSize(R.dimen.multisim_tooltip_bottom_margin));
                return;
            case 4:
                try {
                    ((Context) this.b).startActivity((Intent) this.a);
                    return;
                } catch (ActivityNotFoundException e) {
                    Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
                    return;
                }
            case 5:
                ((UncertifiedDeviceActivity) this.a).startActivity((Intent) this.b);
                return;
            case 6:
                Object obj2 = this.b;
                afnb afnbVar2 = ((afoj) obj2).v;
                if (afnbVar2 == null) {
                    arro.b("emojiSet");
                } else {
                    afnbVar = afnbVar2;
                }
                ((afoq) this.a).j.a(obj2, afnbVar);
                return;
            case 7:
                Object obj3 = this.b;
                if (obj3 != null) {
                    ((afpn) this.a).c.a(obj3);
                    return;
                }
                return;
            case 8:
                int i = afwx.v;
                ((afwz) this.a).d.a(((afwu) this.b).a());
                return;
            case 9:
                int i2 = afwx.v;
                ((afwz) this.a).e.a(((afwu) this.b).a());
                return;
            case 10:
                agwi agwiVar2 = (agwi) this.a;
                agwiVar2.j = !agwiVar2.j;
                agwiVar2.c.removeViews(1, agwiVar2.f);
                for (int i3 = 0; i3 < ((agwi) this.a).f; i3++) {
                    LinearLayout linearLayout = new LinearLayout((Context) this.b);
                    linearLayout.setOrientation(0);
                    linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    int i4 = 0;
                    while (true) {
                        agwiVar = (agwi) this.a;
                        if (i4 < agwiVar.e) {
                            agwiVar.b(i3, i4, agwiVar.j, linearLayout);
                            i4++;
                        }
                    }
                    agwiVar.c.addView(linearLayout);
                }
                return;
            case 11:
                StickerGalleryActivity stickerGalleryActivity = ((aiqp) this.b).z.h;
                if (stickerGalleryActivity != null) {
                    stickerGalleryActivity.y((aova) this.a);
                    return;
                }
                return;
            case 12:
                StickerGalleryActivity stickerGalleryActivity2 = ((aiqt) this.b).y.i;
                if (stickerGalleryActivity2 != null) {
                    stickerGalleryActivity2.y((aova) this.a);
                    return;
                }
                return;
            case 13:
                Object obj4 = this.b;
                aiqt aiqtVar = (aiqt) obj4;
                aiqtVar.v.setClickable(false);
                boolean z = aiqtVar.x;
                aiqtVar.x = !z;
                String str = ((aova) this.a).b;
                if (z) {
                    aiqtVar.y.d.add(str);
                }
                ListenableFuture e2 = aiqtVar.y.h.e(str, aiqtVar.x);
                if (aiqtVar.y.g.containsKey(str)) {
                    ((ListenableFuture) aiqtVar.y.g.get(str)).cancel(true);
                }
                aiqtVar.y.g.put(str, e2);
                albo.bR(e2, new ahjd(obj4, str, view, 2), aiqk.a);
                ((airh) aiqtVar.y.h.g).b(str, aodc.FAVORITES, aiqtVar.x);
                return;
            case 14:
                StickerGalleryActivity stickerGalleryActivity3 = ((airb) ((airo) this.b).s).c;
                if (stickerGalleryActivity3 != null) {
                    stickerGalleryActivity3.setResult(-1, new Intent().putExtra("sticker", ((aoyj) this.a).toByteArray()).putExtra("interaction_source", 3));
                    stickerGalleryActivity3.finish();
                    return;
                }
                return;
            case 15:
                PackDetailsActivity packDetailsActivity = ((airp) ((airo) this.b).s).d;
                if (packDetailsActivity != null && packDetailsActivity.getCallingActivity() != null) {
                    packDetailsActivity.setResult(-1, new Intent().putExtra("sticker", ((aoyj) this.a).toByteArray()).putExtra("interaction_source", 9));
                    packDetailsActivity.finish();
                    return;
                }
                return;
            case 16:
                Object obj5 = this.b;
                airr airrVar = (airr) obj5;
                airrVar.h.setClickable(false);
                boolean z2 = !airrVar.m;
                airrVar.m = z2;
                aiqj aiqjVar = airrVar.n;
                aova aovaVar = (aova) this.a;
                airrVar.j = aiqjVar.e(aovaVar.b, z2);
                albo.bR(airrVar.j, new vbr(obj5, view, 14, null), aiqk.a);
                ((airh) airrVar.n.g).b(aovaVar.b, aodc.PACK_DETAIL, airrVar.m);
                return;
            case 17:
                asgf asgfVar = new asgf();
                ajap ajapVar = (ajap) this.b;
                ajapVar.j(ajapVar.d, ajapVar.k, ajapVar.h, aizr.j(ajapVar.f));
                ajapVar.b.dismissAllowingStateLoss();
                ahnz.K(asgfVar, ajapVar.d, (String) this.a);
                return;
            case 18:
                ((ajap) this.b).g((apro) this.a);
                return;
            case 19:
                ajap ajapVar2 = (ajap) this.b;
                String str2 = ajapVar2.l;
                aozy createBuilder = apqz.a.createBuilder();
                boolean c = ajapVar2.g.c();
                Object obj6 = this.a;
                if (c) {
                    String ag = albo.ag(str2);
                    aozy createBuilder2 = apqv.a.createBuilder();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    ((apqv) createBuilder2.b).b = ag;
                    apqv apqvVar = (apqv) createBuilder2.s();
                    int i5 = ((apro) obj6).e;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    ((apqz) apagVar).d = i5;
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    apqz apqzVar = (apqz) createBuilder.b;
                    apqvVar.getClass();
                    apqzVar.c = apqvVar;
                    apqzVar.b = 5;
                }
                apqz apqzVar2 = (apqz) createBuilder.s();
                if (apqzVar2 != null) {
                    ajapVar2.c.a = apqzVar2;
                }
                ajapVar2.b((apro) obj6);
                ajapVar2.c();
                return;
            default:
                asgf asgfVar2 = new asgf();
                ajap ajapVar3 = (ajap) this.b;
                ajapVar3.j(ajapVar3.d, ajapVar3.k, ajapVar3.h, aizr.j(ajapVar3.f));
                ajapVar3.b.dismissAllowingStateLoss();
                ahnz.K(asgfVar2, ajapVar3.d, (String) this.a);
                return;
        }
    }

    public abbh(Context context, Intent intent, int i) {
        this.c = i;
        this.b = context;
        this.a = intent;
    }

    public /* synthetic */ abbh(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ abbh(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
