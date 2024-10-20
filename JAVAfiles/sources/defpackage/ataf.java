package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ataf implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;
    public atba a;
    public final int b;
    public int c;
    public int d;
    public boolean e = false;
    public boolean f = false;

    public ataf(int i) {
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        if (this.e && !this.f) {
            return this.c;
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ataf clone() {
        ataf atafVar = new ataf(this.b);
        atafVar.a = this.a;
        atafVar.c = this.c;
        atafVar.d = this.d;
        atafVar.e = this.e;
        atafVar.f = this.f;
        return atafVar;
    }
}
