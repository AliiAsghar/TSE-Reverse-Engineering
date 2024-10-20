package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class alix {
    public static final alix a;
    public static final alix b;
    public static final alix c;
    public static final alix d;
    public static final alix e;
    public static final alix f;
    public static final alix g;
    public static final alix h;
    static final alix[] i;
    private static final /* synthetic */ alix[] j;

    static {
        alix alixVar = new alix("STRONG", 0);
        a = alixVar;
        alix alixVar2 = new alix() { // from class: alir
            @Override // defpackage.alix
            public final alke a(aljj aljjVar, alke alkeVar, alke alkeVar2, Object obj) {
                alke a2 = super.a(aljjVar, alkeVar, alkeVar2, obj);
                c(alkeVar, a2);
                return a2;
            }
        };
        b = alixVar2;
        alix alixVar3 = new alix() { // from class: alis
            @Override // defpackage.alix
            public final alke a(aljj aljjVar, alke alkeVar, alke alkeVar2, Object obj) {
                alke a2 = super.a(aljjVar, alkeVar, alkeVar2, obj);
                d(alkeVar, a2);
                return a2;
            }
        };
        c = alixVar3;
        alix alixVar4 = new alix() { // from class: alit
            @Override // defpackage.alix
            public final alke a(aljj aljjVar, alke alkeVar, alke alkeVar2, Object obj) {
                alke a2 = super.a(aljjVar, alkeVar, alkeVar2, obj);
                c(alkeVar, a2);
                d(alkeVar, a2);
                return a2;
            }
        };
        d = alixVar4;
        alix alixVar5 = new alix("WEAK", 4);
        e = alixVar5;
        alix alixVar6 = new alix() { // from class: aliu
            @Override // defpackage.alix
            public final alke a(aljj aljjVar, alke alkeVar, alke alkeVar2, Object obj) {
                alke a2 = super.a(aljjVar, alkeVar, alkeVar2, obj);
                c(alkeVar, a2);
                return a2;
            }
        };
        f = alixVar6;
        alix alixVar7 = new alix() { // from class: aliv
            @Override // defpackage.alix
            public final alke a(aljj aljjVar, alke alkeVar, alke alkeVar2, Object obj) {
                alke a2 = super.a(aljjVar, alkeVar, alkeVar2, obj);
                d(alkeVar, a2);
                return a2;
            }
        };
        g = alixVar7;
        alix alixVar8 = new alix() { // from class: aliw
            @Override // defpackage.alix
            public final alke a(aljj aljjVar, alke alkeVar, alke alkeVar2, Object obj) {
                alke a2 = super.a(aljjVar, alkeVar, alkeVar2, obj);
                c(alkeVar, a2);
                d(alkeVar, a2);
                return a2;
            }
        };
        h = alixVar8;
        j = new alix[]{alixVar, alixVar2, alixVar3, alixVar4, alixVar5, alixVar6, alixVar7, alixVar8};
        i = new alix[]{alixVar, alixVar2, alixVar3, alixVar4, alixVar5, alixVar6, alixVar7, alixVar8};
    }

    public alix(String str, int i2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void c(alke alkeVar, alke alkeVar2) {
        alkeVar2.k(alkeVar.b());
        alkd.c(alkeVar.h(), alkeVar2);
        alkd.c(alkeVar2, alkeVar.f());
        alkd.e(alkeVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void d(alke alkeVar, alke alkeVar2) {
        alkeVar2.q(alkeVar.c());
        alkd.d(alkeVar.i(), alkeVar2);
        alkd.d(alkeVar2, alkeVar.g());
        alkd.f(alkeVar);
    }

    public static alix[] values() {
        return (alix[]) j.clone();
    }

    public alke a(aljj aljjVar, alke alkeVar, alke alkeVar2, Object obj) {
        return b(aljjVar, obj, alkeVar.a(), alkeVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alke b(aljj aljjVar, Object obj, int i2, alke alkeVar) {
        switch (ordinal()) {
            case 0:
                return new aljo(obj, i2, alkeVar);
            case 1:
                return new aljm(obj, i2, alkeVar);
            case 2:
                return new aljq(obj, i2, alkeVar);
            case 3:
                return new aljn(obj, i2, alkeVar);
            case 4:
                return new aljw(aljjVar.h, obj, i2, alkeVar);
            case 5:
                return new alju(aljjVar.h, obj, i2, alkeVar);
            case 6:
                return new aljy(aljjVar.h, obj, i2, alkeVar);
            case 7:
                return new aljv(aljjVar.h, obj, i2, alkeVar);
            default:
                throw null;
        }
    }
}
