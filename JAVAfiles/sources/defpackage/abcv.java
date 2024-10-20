package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.google.android.apps.messaging.R;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abcv extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abcv(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, arml] */
    /* JADX WARN: Type inference failed for: r0v51, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v61, types: [acby, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v73, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v79, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v81, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v83, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v95, types: [byn, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        arqg arqgVar;
        boolean booleanValue;
        boolean booleanValue2;
        enb enbVar = null;
        boolean z = true;
        switch (this.b) {
            case 0:
                if (((Boolean) abcw.b.e()).booleanValue()) {
                    alwl alwlVar = (alwl) abcw.a.g();
                    alwlVar.X(ydl.M, "WearSubscriptionUtil");
                    alwlVar.q("Device is simulating roaming in EU and isMccInEU sets to true ");
                } else {
                    String x = ((abcw) this.a).a().x();
                    alwl alwlVar2 = (alwl) abcw.a.g();
                    alwlVar2.X(ydl.M, "WearSubscriptionUtil");
                    alwlVar2.t("isMccInEu: simOperator=%s", x);
                    x.getClass();
                    z = arsd.z(x, "2", false);
                }
                return Boolean.valueOf(z);
            case 1:
                eoz d = dyt.d(this.a);
                if (d instanceof enb) {
                    enbVar = (enb) d;
                }
                if (enbVar != null) {
                    return enbVar.Q();
                }
                return epb.a;
            case 2:
                if (((Boolean) abcw.b.e()).booleanValue()) {
                    alwl alwlVar3 = (alwl) abcw.a.g();
                    alwlVar3.X(ydl.M, "WearSubscriptionUtil");
                    alwlVar3.q("Device is simulating roaming in EU and isRoaming sets to true ");
                } else {
                    z = ((abcw) this.a).a().F();
                    alwl alwlVar4 = (alwl) abcw.a.g();
                    alwlVar4.X(ydl.M, "WearSubscriptionUtil");
                    alwlVar4.t("isRoaming: %b", Boolean.valueOf(z));
                }
                return Boolean.valueOf(z);
            case 3:
                if (true == ((orj) ((abdv) this.a).h.b()).a()) {
                    enbVar = true;
                }
                return new lci(null, true, null, true, true, enbVar);
            case 4:
                if (((orj) ((abdv) this.a).h.b()).a()) {
                    return new lbv(null, true, null, true, true, true);
                }
                return new lbv(null, true, null, true, true, null);
            case 5:
                return new abfj(((zfj) ((abfe) this.a).g.b()).a, ((abfe) this.a).b);
            case 6:
                return (ViewPager2) ((abfe) this.a).b.findViewById(R.id.welcome_flow_pager);
            case 7:
                acce.n.g("Shortcutting call to areAllowed");
                ?? r0 = this.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(arrn.r(aqjn.i(aqjn.J(r0, 10)), 16));
                for (Object obj : r0) {
                    linkedHashMap.put(obj, true);
                }
                return linkedHashMap;
            case 8:
                acce.n.g("Ignoring call to register listener");
                this.a.a(null);
                return null;
            case 9:
                ((aeid) this.a).b.a(new cjn(9205357640488583168L));
                return arnb.a;
            case 10:
                aekk aekkVar = (aekk) this.a;
                if (aekkVar.d) {
                    arqgVar = aekkVar.c;
                } else {
                    arqgVar = aekkVar.b;
                }
                arqgVar.a();
                return arnb.a;
            case 11:
                return ((brc) this.a).a();
            case 12:
                ?? r02 = this.a;
                booleanValue = ((Boolean) r02.a()).booleanValue();
                r02.h(Boolean.valueOf(!booleanValue));
                return arnb.a;
            case 13:
                ((aeml) this.a).c.a(Boolean.valueOf(!r0.b));
                return arnb.a;
            case 14:
                this.a.h(Boolean.valueOf(true));
                return arnb.a;
            case 15:
                this.a.h(Boolean.valueOf(false));
                return arnb.a;
            case 16:
                this.a.h(Boolean.valueOf(false));
                return arnb.a;
            case 17:
                ((aemn) this.a).b.a();
                return arnb.a;
            case 18:
                ((aeoa) this.a).i.a(aenw.c);
                return arnb.a;
            case 19:
                this.a.a();
                return arnb.a;
            default:
                ?? r03 = this.a;
                booleanValue2 = ((Boolean) r03.a()).booleanValue();
                r03.h(Boolean.valueOf(!booleanValue2));
                return arnb.a;
        }
    }
}
