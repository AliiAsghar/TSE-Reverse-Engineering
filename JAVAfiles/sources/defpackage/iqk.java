package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class iqk implements akvv {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class a extends iqk {
        public final View a;

        public a(View view) {
            this.a = view;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && defpackage.d.F(this.a, ((a) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CameraGallery(view=" + this.a + ")";
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class b extends iqk {
        public final View a;

        public b(View view) {
            this.a = view;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && defpackage.d.F(this.a, ((b) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Contacts(view=" + this.a + ")";
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class c extends iqk {
        public final View a;

        public c(View view) {
            this.a = view;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && defpackage.d.F(this.a, ((c) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Files(view=" + this.a + ")";
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class d extends iqk {
        public final agek a;
        private final View b;

        public d(View view, agek agekVar) {
            agekVar.getClass();
            this.b = view;
            this.a = agekVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (defpackage.d.F(this.b, dVar.b) && this.a == dVar.a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (this.b.hashCode() * 31) + this.a.hashCode();
        }

        public final String toString() {
            return "GifsStickers(view=" + this.b + ", category=" + this.a + ")";
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class e extends iqk {
        public final View a;

        public e(View view) {
            this.a = view;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof e) && defpackage.d.F(this.a, ((e) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Location(view=" + this.a + ")";
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class f extends iqk {
        public final View a;

        public f(View view) {
            this.a = view;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof f) && defpackage.d.F(this.a, ((f) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ScheduledSend(view=" + this.a + ")";
        }
    }
}
