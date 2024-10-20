package defpackage;

import android.view.View;
import android.widget.EditText;
import com.google.android.gms.gmscompliance.ui.UncertifiedDeviceActivity;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class acah implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ acah(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [afgp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [afgp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, arqr] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Optional optional = null;
        switch (this.b) {
            case 0:
                ((UncertifiedDeviceActivity) this.a).finish();
                return;
            case 1:
                aazt aaztVar = (aazt) this.a;
                rw rwVar = aaztVar.v;
                if (rwVar != null) {
                    rwVar.c(aaztVar.f());
                    return;
                }
                return;
            case 2:
                view.getClass();
                ((afgw) this.a).v.a.a(view, null);
                return;
            case 3:
                Object obj = this.a;
                ((afgw) obj).u.a("CameraButtonViewHolder#onButtonClick", new acah(obj, 2));
                return;
            case 4:
                int i = afgz.u;
                view.getClass();
                this.a.a(view, afsu.a);
                return;
            case 5:
                int i2 = afgz.u;
                view.getClass();
                this.a.a(view, afsv.a);
                return;
            case 6:
                Object obj2 = this.a;
                arrn.J(((agai) obj2).bo(), null, null, new aely((afid) obj2, (arpe) null, 9), 3);
                return;
            case 7:
                ((afid) this.a).aZ();
                return;
            case 8:
                afid afidVar = (afid) this.a;
                Optional optional2 = afidVar.aq;
                if (optional2 == null) {
                    arro.b("systemPickerFabClickListener");
                } else {
                    optional = optional2;
                }
                optional.ifPresent(new adoj(new aezb(view, 12), 13));
                afidVar.aZ();
                return;
            case 9:
                afgo afgoVar = afid.e((afid) this.a).d;
                if (afgoVar != null) {
                    view.getClass();
                    afgoVar.a.a(view, null);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            case 10:
                int i3 = afim.u;
                ((afin) this.a).c.a();
                return;
            case 11:
                int i4 = airo.u;
                ((afio) this.a).c.a();
                return;
            case 12:
                new zay(((afkq) ((agai) ((afof) this.a).aW().a).bn().a()).a, 6, (float[]) null).a();
                return;
            case 13:
                ((afkq) ((agai) this.a).bn().a()).a.d();
                return;
            case 14:
                ((afpr) this.a).dismiss();
                return;
            case 15:
                ((afwt) this.a).e();
                return;
            case 16:
                afwt afwtVar = (afwt) this.a;
                ((afwk) afwtVar.k.b).e();
                ((EditText) afwtVar.e.g).requestFocus();
                return;
            case 17:
                afwt afwtVar2 = (afwt) this.a;
                afwtVar2.d(false);
                ((EditText) afwtVar2.e.g).requestFocus();
                return;
            case 18:
                int i5 = afxk.x;
                this.a.a(view);
                return;
            case 19:
                ((agem) this.a).aY();
                return;
            default:
                Object obj3 = this.a;
                arrn.J(((agai) obj3).bo(), null, null, new aghm((agit) obj3, (arpe) null, 4), 3);
                return;
        }
    }
}
