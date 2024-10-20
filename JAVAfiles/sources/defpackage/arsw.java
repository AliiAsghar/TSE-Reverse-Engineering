package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class arsw implements Iterable, arse {
    public final char a;
    public final char b;
    private final int c = 1;

    public arsw(char c, char c2) {
        this.a = c;
        this.b = (char) arhi.e(c, c2, 1);
    }

    public boolean a() {
        if (arro.a(this.a, this.b) > 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof arsw)) {
            return false;
        }
        if (a() && ((arsw) obj).a()) {
            return true;
        }
        arsw arswVar = (arsw) obj;
        if (this.a != arswVar.a || this.b != arswVar.b) {
            return false;
        }
        int i = arswVar.c;
        return true;
    }

    public int hashCode() {
        if (a()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + 1;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new arnt(this.a, this.b);
    }

    public String toString() {
        return this.a + ".." + this.b + " step 1";
    }
}
