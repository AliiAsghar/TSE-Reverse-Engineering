package defpackage;

import android.content.res.Resources;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfu {
    public final HashMap a = new HashMap();

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public final cov a;
        public final int b;

        public a(cov covVar, int i) {
            this.a = covVar;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (d.F(this.a, aVar.a) && this.b == aVar.b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (this.a.hashCode() * 31) + this.b;
        }

        public final String toString() {
            return "ImageVectorEntry(imageVector=" + this.a + ", configFlags=" + this.b + ')';
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class b {
        private final Resources.Theme a;
        private final int b;

        public b(Resources.Theme theme, int i) {
            this.a = theme;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (d.F(this.a, bVar.a) && this.b == bVar.b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (this.a.hashCode() * 31) + this.b;
        }

        public final String toString() {
            return "Key(theme=" + this.a + ", id=" + this.b + ')';
        }
    }

    public final void a() {
        this.a.clear();
    }
}
