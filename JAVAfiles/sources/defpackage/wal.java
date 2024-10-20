package defpackage;

import j$.util.Collection;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wal extends vzs {
    public static final wag a = new wag();
    private final armf b;

    public wal(armf armfVar) {
        this.b = armfVar;
    }

    @Override // defpackage.vzs
    /* renamed from: a */
    public final qez apply(wct wctVar) {
        boolean z;
        wbx wbxVar;
        wed wedVar;
        wbx wbxVar2;
        wbx wbxVar3;
        wbx wbxVar4;
        wbx wbxVar5;
        wbx wbxVar6;
        wbx wbxVar7;
        wbx wbxVar8;
        wbx wbxVar9;
        wbx wbxVar10;
        wbx wbxVar11;
        if (wctVar.c == 4) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "Unexpected missing groupInformation");
        if (wctVar.c == 4) {
            wbxVar = (wbx) wctVar.d;
        } else {
            wbxVar = wbx.a;
        }
        wed wedVar2 = wbxVar.e;
        if (wedVar2 == null) {
            wedVar2 = wed.a;
        }
        d.t(!wedVar2.c.isEmpty(), "Unexpected empty conversation URI ");
        d.t(!wbxVar.c.isEmpty(), "Unexpected empty group conversation id");
        aozy createBuilder = qez.b.createBuilder();
        wbk wbkVar = wctVar.e;
        if (wbkVar == null) {
            wbkVar = wbk.a;
        }
        wcy wcyVar = wbkVar.e;
        if (wcyVar == null) {
            wcyVar = wcy.a;
        }
        String str = wcyVar.c;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qez qezVar = (qez) createBuilder.b;
        str.getClass();
        qezVar.c |= 1;
        qezVar.d = str;
        aozy createBuilder2 = qei.a.createBuilder();
        qeh qehVar = qeh.GROUP;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        qei qeiVar = (qei) createBuilder2.b;
        qeiVar.c = qehVar.e;
        qeiVar.b |= 1;
        wbk wbkVar2 = wctVar.e;
        if (wbkVar2 == null) {
            wbkVar2 = wbk.a;
        }
        wcz wczVar = wbkVar2.d;
        if (wczVar == null) {
            wczVar = wcz.a;
        }
        if (wczVar.b == 2) {
            wedVar = (wed) wczVar.c;
        } else {
            wedVar = wed.a;
        }
        String str2 = wedVar.c;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        qei qeiVar2 = (qei) createBuilder2.b;
        str2.getClass();
        qeiVar2.b |= 2;
        qeiVar2.d = str2;
        qei qeiVar3 = (qei) createBuilder2.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qez qezVar2 = (qez) createBuilder.b;
        qeiVar3.getClass();
        qezVar2.e = qeiVar3;
        qezVar2.c |= 2;
        int i = wctVar.c;
        if (i == 4) {
            wbxVar2 = (wbx) wctVar.d;
        } else {
            wbxVar2 = wbx.a;
        }
        int i2 = 8;
        if ((wbxVar2.b & 8) != 0) {
            if (i == 4) {
                wbxVar10 = (wbx) wctVar.d;
            } else {
                wbxVar10 = wbx.a;
            }
            wbv wbvVar = wbxVar10.g;
            if (wbvVar == null) {
                wbvVar = wbv.a;
            }
            if (wbvVar.c) {
                createBuilder.G(qes.SUBJECT_UPDATE);
            }
            if (wctVar.c == 4) {
                wbxVar11 = (wbx) wctVar.d;
            } else {
                wbxVar11 = wbx.a;
            }
            wbv wbvVar2 = wbxVar11.g;
            if (wbvVar2 == null) {
                wbvVar2 = wbv.a;
            }
            int R = a.R(wbvVar2.d);
            if (R == 0) {
                R = 1;
            }
            int i3 = R - 1;
            if (i3 != 1) {
                if (i3 == 2) {
                    createBuilder.G(qes.REMOVE_PARTICIPANT_BY_ALL);
                }
            } else {
                createBuilder.G(qes.REMOVE_PARTICIPANT_BY_ADMIN);
            }
        }
        if (wctVar.c == 4) {
            wbxVar3 = (wbx) wctVar.d;
        } else {
            wbxVar3 = wbx.a;
        }
        Stream map = Collection.EL.stream(wbxVar3.f).map(new vxg(wctVar, i2));
        int i4 = alog.d;
        createBuilder.F((Iterable) map.collect(alls.a));
        if (wctVar.c == 4) {
            wbxVar4 = (wbx) wctVar.d;
        } else {
            wbxVar4 = wbx.a;
        }
        if ((wbxVar4.b & 2) != 0) {
            aozy createBuilder3 = qfj.a.createBuilder();
            if (wctVar.c == 4) {
                wbxVar5 = (wbx) wctVar.d;
            } else {
                wbxVar5 = wbx.a;
            }
            String str3 = wbxVar5.d;
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            qfj qfjVar = (qfj) createBuilder3.b;
            str3.getClass();
            qfjVar.b |= 1;
            qfjVar.c = str3;
            if (wctVar.c == 4) {
                wbxVar6 = (wbx) wctVar.d;
            } else {
                wbxVar6 = wbx.a;
            }
            if ((wbxVar6.b & 16) != 0) {
                aozy createBuilder4 = qfm.a.createBuilder();
                wbk wbkVar3 = wctVar.e;
                if (wbkVar3 == null) {
                    wbkVar3 = wbk.a;
                }
                if (wctVar.c == 4) {
                    wbxVar7 = (wbx) wctVar.d;
                } else {
                    wbxVar7 = wbx.a;
                }
                wdt wdtVar = wbxVar7.h;
                if (wdtVar == null) {
                    wdtVar = wdt.a;
                }
                wcz wczVar2 = wdtVar.c;
                if (wczVar2 == null) {
                    wczVar2 = wcz.a;
                }
                qei a2 = wam.a(wbkVar3, wczVar2);
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                qfm qfmVar = (qfm) createBuilder4.b;
                a2.getClass();
                qfmVar.c = a2;
                qfmVar.b = 1 | qfmVar.b;
                int i5 = wctVar.c;
                if (i5 == 4) {
                    wbxVar8 = (wbx) wctVar.d;
                } else {
                    wbxVar8 = wbx.a;
                }
                wdt wdtVar2 = wbxVar8.h;
                if (wdtVar2 == null) {
                    wdtVar2 = wdt.a;
                }
                if ((wdtVar2.b & 2) != 0) {
                    if (i5 == 4) {
                        wbxVar9 = (wbx) wctVar.d;
                    } else {
                        wbxVar9 = wbx.a;
                    }
                    wdt wdtVar3 = wbxVar9.h;
                    if (wdtVar3 == null) {
                        wdtVar3 = wdt.a;
                    }
                    apct apctVar = wdtVar3.d;
                    if (apctVar == null) {
                        apctVar = apct.a;
                    }
                    if (!createBuilder4.b.isMutable()) {
                        createBuilder4.u();
                    }
                    qfm qfmVar2 = (qfm) createBuilder4.b;
                    apctVar.getClass();
                    qfmVar2.d = apctVar;
                    qfmVar2.b |= 2;
                }
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                qfj qfjVar2 = (qfj) createBuilder3.b;
                qfm qfmVar3 = (qfm) createBuilder4.s();
                qfmVar3.getClass();
                qfjVar2.d = qfmVar3;
                qfjVar2.b |= 2;
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qez qezVar3 = (qez) createBuilder.b;
            qfj qfjVar3 = (qfj) createBuilder3.s();
            qfjVar3.getClass();
            qezVar3.h = qfjVar3;
            qezVar3.c |= 4;
        }
        qei qeiVar4 = (qei) ((vbu) this.b.b()).e().orElseThrow(new vtc(8));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qez qezVar4 = (qez) createBuilder.b;
        qeiVar4.getClass();
        qezVar4.k = qeiVar4;
        qezVar4.c |= 32;
        return (qez) createBuilder.s();
    }

    @Override // defpackage.vzs, java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        return apply((wct) obj);
    }
}
