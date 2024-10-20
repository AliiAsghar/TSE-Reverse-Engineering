package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class pxw {
    public static final alwo a = alwo.o("BugleFileTransfer");
    public final String b;
    public int c;

    public pxw(String str) {
        this.b = str;
    }

    public final String a() {
        int i = this.c;
        while (i < this.b.length() && Character.isLetterOrDigit(this.b.charAt(i))) {
            i++;
        }
        String substring = this.b.substring(this.c, i);
        this.c = i;
        return substring;
    }

    public final String b() {
        boolean z;
        if (this.b.charAt(this.c) == '\"') {
            int i = this.c + 1;
            this.c = i;
            int indexOf = this.b.indexOf(34, i);
            if (indexOf != -1) {
                z = true;
            } else {
                z = false;
            }
            c(z);
            String substring = this.b.substring(this.c, indexOf);
            this.c = indexOf + 1;
            return substring;
        }
        return a();
    }

    public final void c(boolean z) {
        if (z) {
        } else {
            throw new pxs(String.format("Parsing error at position: %d in '%s'", Integer.valueOf(this.c), this.b));
        }
    }

    public final void d() {
        while (!e() && Character.isWhitespace(this.b.charAt(this.c))) {
            this.c++;
        }
    }

    public final boolean e() {
        if (this.c == this.b.length()) {
            return true;
        }
        return false;
    }
}
