package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import j$.time.Instant;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kah extends arrp implements arqg {
    final /* synthetic */ miz a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ List e;
    final /* synthetic */ mlt f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kah(miz mizVar, mlt mltVar, boolean z, boolean z2, boolean z3, List list) {
        super(0);
        this.a = mizVar;
        this.f = mltVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = list;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11, types: [ock, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v40, types: [armf, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        boolean t;
        String str;
        boolean z;
        aeuq aeuqVar;
        int i;
        int i2;
        Instant h;
        miz mizVar = this.a;
        if (mizVar instanceof mty) {
            return arnv.a;
        }
        mlt mltVar = this.f;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        List list = this.e;
        aron aronVar = new aron((byte[]) null);
        if (mltVar.e()) {
            t = true;
        } else {
            t = adom.t((Context) mltVar.n);
        }
        if (lga.bP(mizVar)) {
            mltVar.d(aronVar, mizVar, t);
            mlt.j(mltVar, aronVar, mizVar, z2);
            mltVar.h(aronVar, mizVar, z3);
        } else {
            ((Boolean) mltVar.k.b()).booleanValue();
            if (!lga.bY(mizVar)) {
                if (((Boolean) mltVar.k.b()).booleanValue()) {
                    h = mizVar.h();
                } else {
                    h = mizVar.h();
                }
                str = ((znj) mltVar.b).A(h.toEpochMilli()).toString();
            } else {
                str = null;
            }
            if (str != null) {
                aronVar.add(new aeuy(str, null, false, null, null, false, 126));
            }
            if (!((ansy) ((nuw) mltVar.a).a.b()).e("bugle.disable_protocol_label_for_satellite_incoming_messages") || !mltVar.e() || !lga.bU(mizVar)) {
                if (mltVar.c.a()) {
                    if (lga.cb(mizVar) && !lga.bY(mizVar)) {
                        aronVar.add(new aeup(null));
                        aronVar.add(new aeuy(mizVar.l(), null, false, null, null, false, 126));
                        if (lga.bZ(mizVar)) {
                            String string = ((Context) mltVar.n).getResources().getString(R.string.link_to_settings);
                            string.getClass();
                            aronVar.add(new aeuy(string, new jyb(mltVar, 15), false, null, null, false, 124));
                        }
                    }
                } else if (lga.bV(mizVar) && lga.cb(mizVar) && !lga.bY(mizVar) && !lga.bT(mizVar)) {
                    aronVar.add(new aeuy(mizVar.l(), null, false, null, null, false, 126));
                    if (lga.bZ(mizVar)) {
                        String string2 = ((Context) mltVar.n).getResources().getString(R.string.link_to_settings);
                        string2.getClass();
                        aronVar.add(new aeuy(string2, new jyb(mltVar, 16), false, null, null, false, 124));
                    }
                }
            }
            if (t && !lga.bY(mizVar)) {
                z = true;
            } else {
                z = false;
            }
            mltVar.d(aronVar, mizVar, z);
            if (lga.bV(mizVar)) {
                if (lga.bW(mizVar) && z4 && mlt.i(mizVar) == aerb.di) {
                    mje c = mizVar.c();
                    c.getClass();
                    mjp b = ((mjm) c).b();
                    alog a = b.a();
                    if (b.b()) {
                        if (true != (mizVar.e() instanceof myr)) {
                            i2 = R.string.message_status_media_seen_by_all;
                        } else {
                            i2 = R.string.message_status_seen_by_all;
                        }
                        aronVar.add(new aeup(null));
                        String string3 = ((Context) mltVar.n).getResources().getString(i2);
                        string3.getClass();
                        aronVar.add(new aeuy(string3, null, false, null, null, false, 126));
                    } else {
                        if (true != (mizVar.e() instanceof myr)) {
                            i = R.plurals.message_status_media_seen_by_list;
                        } else {
                            i = R.plurals.message_status_seen_by_list;
                        }
                        aronVar.add(new aeup(null));
                        Resources resources = ((Context) mltVar.n).getResources();
                        int size = a.size();
                        a.getClass();
                        String quantityString = resources.getQuantityString(i, size, aqjn.aK(a, ", ", null, null, new jsv(mltVar, 15), 30));
                        quantityString.getClass();
                        aronVar.add(new aeuy(quantityString, null, true, null, null, false, 118));
                    }
                } else if (((lga.bW(mizVar) || lga.bY(mizVar)) && t) || lga.bT(mizVar)) {
                    mje c2 = mizVar.c();
                    aerb i3 = mlt.i(mizVar);
                    if (i3 != null) {
                        aeuqVar = new aeuq(i3, null, 6);
                    } else {
                        aeuqVar = null;
                    }
                    if (c2 instanceof mum) {
                        mum mumVar = (mum) c2;
                        if (!mumVar.a().b()) {
                            mix a2 = mumVar.a();
                            a2.getClass();
                            aerb g = mlt.g(a2);
                            if (g != null) {
                                aronVar.add(new aeuq(g, null, 6));
                            }
                        }
                    }
                    if (aeuqVar != null) {
                        aronVar.add(aeuqVar);
                    }
                }
            }
            mlt.j(mltVar, aronVar, mizVar, z2);
            mltVar.h(aronVar, mizVar, z3);
            if (((Optional) mltVar.m).isPresent()) {
                aronVar.addAll(list);
            }
        }
        return aqjn.x(aronVar);
    }
}
