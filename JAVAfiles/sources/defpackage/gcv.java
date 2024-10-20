package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcv extends dyh {
    public final gdm a;
    public final gdm b;

    public gcv(gdm gdmVar, gdm gdmVar2) {
        super(null);
        this.a = gdmVar;
        this.b = gdmVar2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gcv) {
            gdm gdmVar = this.a;
            gcf gcfVar = (gcf) gdmVar;
            int i = gcfVar.d;
            gcv gcvVar = (gcv) obj;
            gdm gdmVar2 = gcvVar.a;
            gcf gcfVar2 = (gcf) gdmVar2;
            if (i == gcfVar2.d && gcfVar.e == gcfVar2.e && gdmVar.f() == gdmVar2.f() && gcfVar.c == gcfVar2.c) {
                gdm gdmVar3 = this.b;
                gcf gcfVar3 = (gcf) gdmVar3;
                int i2 = gcfVar3.d;
                gdm gdmVar4 = gcvVar.b;
                gcf gcfVar4 = (gcf) gdmVar4;
                if (i2 == gcfVar4.d && gcfVar3.e == gcfVar4.e && gdmVar3.f() == gdmVar4.f() && gcfVar3.c == gcfVar4.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    public final String toString() {
        return arsd.s("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: " + ((gcf) this.a).d + "\n                    |       placeholdersAfter: " + ((gcf) this.a).e + "\n                    |       size: " + this.a.f() + "\n                    |       dataCount: " + ((gcf) this.a).c + "\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: " + ((gcf) this.b).d + "\n                    |       placeholdersAfter: " + ((gcf) this.b).e + "\n                    |       size: " + this.b.f() + "\n                    |       dataCount: " + ((gcf) this.b).c + "\n                    |   )\n                    |");
    }
}
