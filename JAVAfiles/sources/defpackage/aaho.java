package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaho extends arrp implements arqv {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaho(aeja aejaVar, cga cgaVar, cmb cmbVar, drk drkVar, int i) {
        super(2);
        this.e = i;
        this.b = aejaVar;
        this.c = cgaVar;
        this.d = cmbVar;
        this.a = drkVar;
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r14v2, types: [cas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [aeja, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v29, types: [aeja, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, cga] */
    /* JADX WARN: Type inference failed for: r4v13, types: [cmb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, aerq] */
    /* JADX WARN: Type inference failed for: r8v6, types: [aemc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [csv, java.lang.Object] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        boolean booleanValue;
        ?? r1;
        int i = this.e;
        boolean z = true;
        boolean z2 = false;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            bwj bwjVar = (bwj) obj;
                            if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
                                bwjVar.v();
                            } else {
                                aeke.aV(this.a, this.b, (awg) this.c, this.d, bwjVar, 64);
                            }
                            return arnb.a;
                        }
                        float floatValue = ((Number) obj2).floatValue();
                        ((crc) obj).getClass();
                        arrx arrxVar = (arrx) this.a;
                        if (!arrxVar.a) {
                            float f = ((arry) this.b).a + floatValue;
                            if (f >= brg.a || Math.abs(f) < 150.0f || this.d == null) {
                                z = false;
                            }
                            arrxVar.a = z;
                            ((arry) this.b).a = f;
                            if (((arrx) this.a).a && (r1 = this.d) != 0) {
                                r1.a(this.c);
                            }
                        }
                        return arnb.a;
                    }
                    bwj bwjVar2 = (bwj) obj;
                    if ((((Number) obj2).intValue() & 11) == 2 && bwjVar2.L()) {
                        bwjVar2.v();
                    } else {
                        ?? r12 = this.b;
                        afbz b = r12.b();
                        afbz b2 = r12.b();
                        if (b2 != null) {
                            z = b2.h;
                        }
                        boolean z3 = z;
                        if (r12 instanceof aeiv) {
                            z2 = ((aeiv) r12).a;
                        }
                        boolean z4 = z2;
                        bwjVar2.y(-488768612);
                        Object h = bwjVar2.h();
                        if (h == bwj.a.a) {
                            h = aejv.a;
                            bwjVar2.B(h);
                        }
                        bwjVar2.q();
                        adom.be(b, null, z3, 5, z4, (arqv) ((arth) h), cdk.e(-1211761644, new aejx(this.b, this.c, this.d, (drk) this.a), bwjVar2), bwjVar2, 1772544, 2);
                    }
                    return arnb.a;
                }
                bwj bwjVar3 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar3.L()) {
                    bwjVar3.v();
                } else {
                    yzc.t(null, null, false, null, false, cdk.e(-16136852, new aaho(this.a, this.b, this.c, this.d, 0), bwjVar3), bwjVar3, 196608, 31);
                }
                return arnb.a;
            }
            bwj bwjVar4 = (bwj) obj;
            if ((((Number) obj2).intValue() & 11) == 2 && bwjVar4.L()) {
                bwjVar4.v();
            } else {
                bpq d = bnb.d(true, bwjVar4, 6, 2);
                long j = cku.g;
                awg awgVar = jxe.a;
                long a = jxe.a(bwjVar4);
                ?? r8 = this.a;
                aeke.ac(null, d, j, a, r8, cdk.e(799993543, new zzr((jxf) r8, (arqr) this.b, (cas) this.d, (byn) this.c, 1), bwjVar4), bwjVar4, 196992, 1);
            }
            return arnb.a;
        }
        bwj bwjVar5 = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar5.L()) {
            bwjVar5.v();
        } else {
            aajq aajqVar = (aajq) ((aahp) this.a).a.b();
            String string = ((Context) aajqVar.a).getString(R.string.unwanted_messages_toolstone_link);
            string.getClass();
            String string2 = ((Context) aajqVar.a).getString(R.string.unwanted_messages_toolstone_text, string);
            string2.getClass();
            aahr c = aajq.c(aajqVar, string2, string, Integer.valueOf(R.drawable.gs_gshield_vd_theme_24), 8);
            byn bynVar = (byn) cdy.b(new Object[0], null, new zzq(this.a, 10), bwjVar5, 8, 6);
            jda jdaVar = new jda((aahp) this.a, (arqg) this.b, (ConversationIdType) this.c, bynVar, 18);
            booleanValue = ((Boolean) bynVar.a()).booleanValue();
            wf.a(booleanValue, null, wx.g(null, 3), wx.h(null, 3), null, cdk.e(-1541617772, new aeoz(c, jdaVar, (aahp) this.a, (ConversationIdType) this.c, (ParticipantsTable.BindData) this.d, 1), bwjVar5), bwjVar5, 200064, 18);
        }
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaho(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(2);
        this.e = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaho(Object obj, Object obj2, Object obj3, Object obj4, int i, byte[] bArr) {
        super(2);
        this.e = i;
        this.a = obj;
        this.b = obj2;
        this.d = obj3;
        this.c = obj4;
    }
}
