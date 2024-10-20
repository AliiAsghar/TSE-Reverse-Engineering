package defpackage;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyb extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyb(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r0v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v74, types: [yga, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        boolean z = true;
        switch (this.b) {
            case 0:
                ((jyk) this.a).d.b();
                return arnb.a;
            case 1:
                return (jfd) this.a.b();
            case 2:
                ((jyk) this.a).E.b(lof.a);
                return arnb.a;
            case 3:
                jyk jykVar = (jyk) this.a;
                qjh.l(jykVar.f, null, new jpc(jykVar, (arpe) null, 19, (byte[]) null), 3);
                return arnb.a;
            case 4:
                return new Object[((asai[]) this.a).length];
            case 5:
                return Boolean.valueOf(((aov) this.a).i());
            case 6:
                return ((aov) this.a).d().i();
            case 7:
                Object obj = ((arsb) this.a).a;
                if (obj == null) {
                    arro.b("job");
                    return null;
                }
                return (arxm) obj;
            case 8:
                Object obj2 = ((arsb) this.a).a;
                if (obj2 == null) {
                    arro.b("job");
                    return null;
                }
                return (arxm) obj2;
            case 9:
                return Boolean.valueOf(((kag) this.a).b.e());
            case 10:
                String format = Instant.ofEpochMilli(lga.bI(this.a)).atZone(ZoneId.systemDefault()).toLocalTime().format(DateTimeFormatter.ofPattern("h:mm a"));
                format.getClass();
                return format;
            case 11:
                kdj kdjVar = (kdj) arsd.k(((kag) this.a).a);
                if (kdjVar != null) {
                    kdjVar.a();
                }
                return arnb.a;
            case 12:
                ((kag) this.a).c.b();
                return arnb.a;
            case 13:
                ((kag) this.a).c.b();
                return arnb.a;
            case 14:
                return new Object[((asai[]) this.a).length];
            case 15:
                ((lkd) ((mlt) this.a).h).b(lnv.a);
                return arnb.a;
            case 16:
                ((lkd) ((mlt) this.a).h).b(lnv.a);
                return arnb.a;
            case 17:
                return this.a;
            case 18:
                this.a.a();
                return arnb.a;
            case 19:
                if (((kam) this.a).c != null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                if (((kam) this.a).b != null) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
