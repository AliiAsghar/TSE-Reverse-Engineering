package defpackage;

import android.content.Context;
import android.os.Build;
import android.transition.Slide;
import android.view.View;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afhj extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afhj(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, android.transition.Slide] */
    /* JADX WARN: Type inference failed for: r2v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [armf, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        afdm afdmVar;
        aeke aekeVar;
        afgl afglVar;
        boolean z = true;
        ?? r2 = 0;
        adwo adwoVar = null;
        addp addpVar = null;
        afxz afxzVar = null;
        switch (this.b) {
            case 0:
                this.a.a();
                return arnb.a;
            case 1:
                ((afhe) this.a).b.a();
                return arnb.a;
            case 2:
                if (((gqg) this.a).b() <= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                return Boolean.valueOf(!(((gqg) this.a).c().a instanceof gax));
            case 4:
                return new agfy(((afhv) this.a).a.getResources().getDimensionPixelSize(R.dimen.standard_view_padding));
            case 5:
                return new afhu((afhv) this.a);
            case 6:
                return Integer.valueOf(((afhv) this.a).a.getResources().getDimensionPixelSize(R.dimen.camera_gallery_reactive_grid_threshold));
            case 7:
                armf armfVar = ((afid) this.a).av;
                if (armfVar == null) {
                    arro.b("_attachmentResolverConfiguration");
                    armfVar = null;
                }
                Object b = armfVar.b();
                b.getClass();
                Optional optional = (Optional) b;
                if (optional.isPresent()) {
                    afdmVar = optional.get();
                } else {
                    afdmVar = new afdm(r2);
                }
                return afdmVar;
            case 8:
                return ((afid) this.a).aQ();
            case 9:
                return new aiim(((cg) this.a).L());
            case 10:
                ?? slide = new Slide(80);
                Object obj = this.a;
                slide.setDuration(((cg) obj).L().getContext().getResources().getInteger(R.integer.camera_gallery_fab_transition_duration));
                View view = ((afid) obj).c;
                if (view == null) {
                    arro.b("fabsContainer");
                } else {
                    r2 = view;
                }
                slide.addTarget(r2);
                return slide;
            case 11:
                afxz afxzVar2 = ((afid) this.a).az;
                if (afxzVar2 == null) {
                    arro.b("galleryLoaderFactory");
                } else {
                    afxzVar = afxzVar2;
                }
                return afxzVar.c(afid.e((afid) this.a));
            case 12:
                affy affyVar = (affy) ((afid) this.a).al.a();
                affyVar.getClass();
                return new afig(affyVar);
            case 13:
                afgo afgoVar = afid.e((afid) this.a).d;
                if (afgoVar != null) {
                    aekeVar = afgoVar.c;
                } else {
                    aekeVar = null;
                }
                if (aekeVar instanceof afgl) {
                    afglVar = (afgl) aekeVar;
                } else {
                    afglVar = null;
                }
                if (afglVar == null) {
                    return null;
                }
                return new afhq(afglVar);
            case 14:
                addp addpVar2 = ((afid) this.a).aA;
                if (addpVar2 == null) {
                    arro.b("gridStateControllerFactory");
                } else {
                    addpVar = addpVar2;
                }
                afid afidVar = (afid) this.a;
                afhq a = afidVar.a();
                afhw e = afid.e(afidVar);
                Context context = (Context) addpVar.b.b();
                context.getClass();
                aday adayVar = (aday) addpVar.a.b();
                e.getClass();
                return new afhv(context, adayVar, a, e);
            case 15:
                Object obj2 = this.a;
                afkj afkjVar = afkj.a;
                List list = (List) afid.e((afid) obj2).e.a();
                list.getClass();
                if (Build.VERSION.SDK_INT <= 32) {
                    return aqjn.y(afkj.c);
                }
                aron aronVar = new aron((byte[]) null);
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (d.F(((afru) it.next()).b(), afss.a)) {
                                aronVar.add(afkj.d);
                            }
                        }
                    }
                }
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (d.F(((afru) it2.next()).b(), afsu.a)) {
                                aronVar.add(afkj.e);
                            }
                        }
                    }
                }
                if (!list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (d.F(((afru) it3.next()).b(), afsv.a)) {
                                aronVar.add(afkj.f);
                            }
                        }
                    }
                }
                return aqjn.x(aronVar);
            case 16:
                return ((afid) this.a).aQ();
            case 17:
                adwo adwoVar2 = ((afid) this.a).ay;
                if (adwoVar2 == null) {
                    arro.b("selectionFactory");
                } else {
                    adwoVar = adwoVar2;
                }
                return new ageu((cg) ((apxx) adwoVar.a).a, afid.e((afid) this.a).i, new afhj(this.a, 16));
            case 18:
                return ((cg) this.a).F().aL();
            case 19:
                return ((cg) this.a).F().Q();
            default:
                return ((afif) this.a).a();
        }
    }
}
