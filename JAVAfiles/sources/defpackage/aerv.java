package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aerv extends arrp implements arqv {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aerv(Object obj, boolean z, int i) {
        super(2);
        this.c = i;
        this.b = obj;
        this.a = z;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        long j;
        cas a;
        arqv arqvVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        aktz aktzVar;
        int i = this.c;
        if (i != 0) {
            boolean z6 = true;
            if (i != 1) {
                if (i != 2) {
                    arpi arpiVar = (arpi) obj;
                    arpg arpgVar = (arpg) obj2;
                    if (!(arpgVar instanceof aktz)) {
                        return arpiVar.plus(arpgVar);
                    }
                    arpg arpgVar2 = ((arpi) ((arsb) this.b).a).get(arpgVar.getKey());
                    if (arpgVar2 == null) {
                        if (this.a) {
                            aktzVar = ((aktz) arpgVar).c();
                        } else {
                            aktzVar = (aktz) arpgVar;
                        }
                        return arpiVar.plus(aktzVar);
                    }
                    arsb arsbVar = (arsb) this.b;
                    arsbVar.a = ((arpi) arsbVar.a).minusKey(arpgVar.getKey());
                    aktz aktzVar2 = (aktz) arpgVar;
                    aktx aktxVar = akqj.b().e;
                    if (aktxVar != null) {
                        z = aktxVar.b;
                    } else {
                        z = true;
                    }
                    if (aktxVar != null) {
                        z2 = aktxVar.e();
                    } else {
                        z2 = false;
                    }
                    if (!akqj.a && !aktzVar2.c) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z && !z2 && !aktzVar2.d && !aktzVar2.f.e()) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    aktz aktzVar3 = (aktz) arpgVar2.get(aktz.a);
                    if (aktzVar3 != null) {
                        if (!z3 && !aktzVar3.c && !aktzVar3.e) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if ((z4 || aktzVar3.d) && !aktzVar3.e) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    }
                    aksb aksbVar = aktzVar2.b;
                    if (!z3 && !aktzVar2.e) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (!z4 || aktzVar2.e) {
                        z6 = false;
                    }
                    return arpiVar.plus(new aktz(aksbVar, z5, z6, false));
                }
                bwj bwjVar = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
                    bwjVar.v();
                } else {
                    Object obj3 = this.b;
                    boolean z7 = this.a;
                    afaw afawVar = (afaw) obj3;
                    afat afatVar = afawVar.a;
                    if (!(afatVar instanceof afas) || ((afas) afatVar).c == null) {
                        z6 = false;
                    }
                    adom.bI(afawVar.b, z7, z6, bwjVar, 0);
                }
                return arnb.a;
            }
            bwj bwjVar2 = (bwj) obj;
            if ((((Number) obj2).intValue() & 11) == 2 && bwjVar2.L()) {
                bwjVar2.v();
            } else {
                ascv ascvVar = ((jwy) ((jco) this.b).a().f.b()).g;
                bwjVar2.y(-938997417);
                if (ascvVar == null) {
                    a = null;
                } else {
                    a = cak.a(ascvVar, bwjVar2);
                }
                bwjVar2.q();
                boolean z8 = ((jco) this.b).a().b instanceof EmergencySosConversationId;
                ascd ascdVar = ((kjc) ((jco) this.b).i.b()).i;
                if (a != null) {
                    arqvVar = (arqv) a.a();
                } else {
                    arqvVar = null;
                }
                boolean z9 = this.a;
                Object obj4 = this.b;
                yzc.t(ascdVar, arqvVar, z9, new ipk(obj4, 6), z8, cdk.e(-802663644, new jcn((jco) obj4, z8), bwjVar2), bwjVar2, 196616, 0);
            }
            return arnb.a;
        }
        bwj bwjVar3 = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar3.L()) {
            bwjVar3.v();
        } else {
            cga h = amv.h(amh.d(cga.e, 8.0f), 20.0f);
            cor bg = aeke.bg((aerb) this.b, bwjVar3);
            if (this.a) {
                bwjVar3.y(-1508093373);
                j = bmp.a(bwjVar3).g;
                bwjVar3.q();
            } else {
                bwjVar3.y(-1508028738);
                j = bmp.a(bwjVar3).s;
                bwjVar3.q();
            }
            ahji.N(bg, null, h, j, bwjVar3, 392, 0);
        }
        return arnb.a;
    }
}
