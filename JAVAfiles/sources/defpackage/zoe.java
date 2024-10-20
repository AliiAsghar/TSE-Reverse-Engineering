package defpackage;

import androidx.preference.SwitchPreferenceCompat;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zoe {
    public final zod a;
    public final yul b;
    public final akbo c;
    public SwitchPreferenceCompat d;
    public final akbp e = new akbp<Boolean, Void>() { // from class: zoe.1
        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            SwitchPreferenceCompat switchPreferenceCompat = zoe.this.d;
            switchPreferenceCompat.getClass();
            switchPreferenceCompat.k(!((Boolean) obj).booleanValue());
            zoe.this.d.G(true);
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            SwitchPreferenceCompat switchPreferenceCompat = zoe.this.d;
            switchPreferenceCompat.getClass();
            switchPreferenceCompat.k(((Boolean) obj).booleanValue());
            zoe.this.d.G(true);
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final akgh f = new akgh<Boolean>() { // from class: zoe.2
        @Override // defpackage.akgh
        public final void a(Throwable th) {
            SwitchPreferenceCompat switchPreferenceCompat = zoe.this.d;
            switchPreferenceCompat.getClass();
            switchPreferenceCompat.G(true);
        }

        @Override // defpackage.akgh
        public final /* bridge */ /* synthetic */ void c(Object obj) {
            SwitchPreferenceCompat switchPreferenceCompat = zoe.this.d;
            switchPreferenceCompat.getClass();
            switchPreferenceCompat.G(true);
            zoe.this.d.k(((Boolean) obj).booleanValue());
        }

        @Override // defpackage.akgh
        public final /* synthetic */ void b() {
        }
    };
    public final aohs g;

    public zoe(zod zodVar, aohs aohsVar, akbo akboVar, yul yulVar) {
        this.a = zodVar;
        this.b = yulVar;
        this.g = aohsVar;
        this.c = akboVar;
    }
}
