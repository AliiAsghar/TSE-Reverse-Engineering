package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkf extends arpw implements arqy {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkf(jdb jdbVar, arpe arpeVar, int i) {
        super(5, arpeVar);
        this.f = i;
        this.e = jdbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v32, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [miu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [afat] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [miu, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        List y;
        afat afasVar;
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    aqil.P(obj);
                    ?? r1 = ((zap) this.e).d;
                    ?? r2 = this.b;
                    boolean z = this.a;
                    Object obj2 = this.c;
                    Object obj3 = this.d;
                    if (z) {
                        int i2 = alog.d;
                        alog alogVar = alsx.a;
                        alogVar.getClass();
                        return new zyc(alogVar);
                    }
                    if (r2.b() != mit.GROUP) {
                        return obj2;
                    }
                    return obj3;
                }
                aqil.P(obj);
                Object obj4 = this.b;
                ?? r3 = this.c;
                Object obj5 = this.d;
                boolean z2 = this.a;
                if (z2) {
                    y = arnv.a;
                } else {
                    y = aqjn.y(((ljp) this.e).g);
                }
                List list = y;
                aehz a = ((ljp) this.e).a();
                if (z2) {
                    String string = ((Context) ((ljp) this.e).c).getString(R.string.search_hint_empty);
                    boolean a2 = ((pku) ((ljp) this.e).b.b()).a();
                    Object obj6 = this.e;
                    afasVar = new afar((String) obj4, string, a2, new jya(((ljp) obj6).e, 20, (char[]) null, (byte[]) null), new kfq(obj5, obj6, 17));
                } else {
                    String string2 = ((Context) ((ljp) this.e).c).getString(R.string.multi_share_top_app_bar_title);
                    string2.getClass();
                    afasVar = new afas(string2, null, null, false, null, null, null, 254);
                }
                return new ljq(new afaw(afasVar, a, list, false, null, null, 112), (lix) obj5, r3);
            }
            aqil.P(obj);
            Object obj7 = this.b;
            ?? r8 = this.c;
            Object obj8 = this.d;
            if (this.a) {
                return null;
            }
            if (((jdb) this.e).c.e || r8.b() == mit.RBM || !r8.i()) {
                return null;
            }
            String string3 = ((jdb) this.e).a.getString(R.string.contact_picker_title_add_people);
            string3.getClass();
            return new aehz(string3, aerb.bh, false, !((jdb) r1).c.d, false, false, null, null, new jda(this.e, obj7, (Object) r8, obj8, 0), 1012);
        }
        aqil.P(obj);
        boolean z3 = this.a;
        Object obj9 = this.b;
        Object obj10 = this.c;
        ?? r6 = this.d;
        Object obj11 = obj10;
        if (obj10 == null) {
            obj11 = afap.a;
        }
        kjo kjoVar = (kjo) obj9;
        return new afaw(obj11, new aehz(kjoVar.a, kjoVar.b, false, false, false, kjoVar.d, null, null, kjoVar.e, 988), r6, z3, new jya(this.e, 18, (float[][][]) null), new afav(null), 8);
    }

    @Override // defpackage.arqy
    public final /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    kkf kkfVar = new kkf((zap) this.e, (arpe) obj5, 3);
                    kkfVar.b = (miu) obj;
                    kkfVar.a = booleanValue;
                    kkfVar.c = (zyc) obj3;
                    kkfVar.d = (zyc) obj4;
                    return kkfVar.b(arnb.a);
                }
                boolean booleanValue2 = ((Boolean) obj4).booleanValue();
                kkf kkfVar2 = new kkf((ljp) this.e, (arpe) obj5, 2);
                kkfVar2.b = (String) obj;
                kkfVar2.c = (List) obj2;
                kkfVar2.d = (lix) obj3;
                kkfVar2.a = booleanValue2;
                return kkfVar2.b(arnb.a);
            }
            boolean booleanValue3 = ((Boolean) obj4).booleanValue();
            kkf kkfVar3 = new kkf((jdb) this.e, (arpe) obj5, 1);
            kkfVar3.b = (alog) obj;
            kkfVar3.c = (miu) obj2;
            kkfVar3.d = (mwc) obj3;
            kkfVar3.a = booleanValue3;
            return kkfVar3.b(arnb.a);
        }
        boolean booleanValue4 = ((Boolean) obj).booleanValue();
        kkf kkfVar4 = new kkf((kkg) this.e, (arpe) obj5, 0);
        kkfVar4.a = booleanValue4;
        kkfVar4.b = (kjo) obj2;
        kkfVar4.c = (afat) obj3;
        kkfVar4.d = (List) obj4;
        return kkfVar4.b(arnb.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkf(kkg kkgVar, arpe arpeVar, int i) {
        super(5, arpeVar);
        this.f = i;
        this.e = kkgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkf(ljp ljpVar, arpe arpeVar, int i) {
        super(5, arpeVar);
        this.f = i;
        this.e = ljpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkf(zap zapVar, arpe arpeVar, int i) {
        super(5, arpeVar);
        this.f = i;
        this.e = zapVar;
    }
}
