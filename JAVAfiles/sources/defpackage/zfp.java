package defpackage;

import androidx.preference.SwitchPreferenceCompat;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfp {
    public final armf a;
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public SwitchPreferenceCompat g;
    public final akbp h;

    public zfp(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.d = armfVar4;
        this.e = armfVar5;
        this.f = armfVar6;
        this.h = new akbp<Boolean, Void>() { // from class: zfp.1
            @Override // defpackage.akbp
            public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SwitchPreferenceCompat switchPreferenceCompat = zfp.this.g;
                if (switchPreferenceCompat != null) {
                    switchPreferenceCompat.G(true);
                }
                SwitchPreferenceCompat switchPreferenceCompat2 = zfp.this.g;
                if (switchPreferenceCompat2 != null) {
                    switchPreferenceCompat2.k(!booleanValue);
                }
            }

            @Override // defpackage.akbp
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SwitchPreferenceCompat switchPreferenceCompat = zfp.this.g;
                if (switchPreferenceCompat != null) {
                    switchPreferenceCompat.G(false);
                }
                SwitchPreferenceCompat switchPreferenceCompat2 = zfp.this.g;
                if (switchPreferenceCompat2 != null) {
                    switchPreferenceCompat2.k(booleanValue);
                }
            }

            @Override // defpackage.akbp
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                ((Boolean) obj).booleanValue();
                SwitchPreferenceCompat switchPreferenceCompat = zfp.this.g;
                if (switchPreferenceCompat != null) {
                    switchPreferenceCompat.G(true);
                }
            }
        };
    }
}
