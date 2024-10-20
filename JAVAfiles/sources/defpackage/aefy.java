package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aefy extends aefp {
    public aefy() {
        super(abjr.COMPONENT_ENABLED_SETTING_FIX, 0L);
    }

    private static ComponentName c(Context context, String str) {
        return new ComponentName(context.getPackageName(), str);
    }

    private static int d(int i) {
        int i2 = i - 2;
        if (i2 != 1) {
            if (i2 == 2) {
                return 2;
            }
            if (i2 == 3) {
                return 1;
            }
            throw new UnsupportedOperationException();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aefp
    public final aefu a(aefu aefuVar, algw algwVar) {
        abjt abjtVar;
        if (algwVar.f() && ((abke) algwVar.b()).b == 8) {
            abke abkeVar = (abke) algwVar.b();
            if (abkeVar.b == 8) {
                abjtVar = (abjt) abkeVar.c;
            } else {
                abjtVar = abjt.a;
            }
            HashSet hashSet = new HashSet();
            Iterator<E> it = abjtVar.b.iterator();
            while (it.hasNext()) {
                if (!hashSet.add(((abjs) it.next()).b)) {
                    throw new IllegalArgumentException("Duplicate componentName in config");
                }
            }
            Context context = aefuVar.b;
            if (Build.VERSION.SDK_INT >= 33) {
                ArrayList arrayList = new ArrayList();
                for (abjs abjsVar : abjtVar.b) {
                    ComponentName c = c(context, abjsVar.b);
                    int Z = a.Z(abjsVar.c);
                    if (Z == 0) {
                        Z = 1;
                    }
                    arrayList.add(new PackageManager.ComponentEnabledSetting(c, d(Z), 1));
                }
                context.getPackageManager().setComponentEnabledSettings(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList();
                int i = 0;
                while (i < abjtVar.b.size()) {
                    try {
                        abjs abjsVar2 = (abjs) abjtVar.b.get(i);
                        PackageManager packageManager = context.getPackageManager();
                        ComponentName c2 = c(context, abjsVar2.b);
                        int componentEnabledSetting = packageManager.getComponentEnabledSetting(c2);
                        int Z2 = a.Z(abjsVar2.c);
                        if (Z2 == 0) {
                            Z2 = 1;
                        }
                        packageManager.setComponentEnabledSetting(c2, d(Z2), 1);
                        arrayList2.add(Integer.valueOf(componentEnabledSetting));
                        i++;
                    } catch (IllegalArgumentException e) {
                        PackageManager packageManager2 = context.getPackageManager();
                        while (true) {
                            i--;
                            if (i < 0) {
                                break;
                            }
                            packageManager2.setComponentEnabledSetting(c(context, ((abjs) abjtVar.b.get(i)).b), ((Integer) arrayList2.get(i)).intValue(), 1);
                        }
                        throw new IllegalArgumentException("Failed to set componentEnabled state.", e);
                    }
                }
            }
            if (!abjtVar.c) {
                aeft aeftVar = new aeft(aefuVar);
                aeftVar.c();
                return aeftVar.a();
            }
            return aefuVar;
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.aefp
    public final String b() {
        return "COMPONENT_ENABLED_SETTING_FIX";
    }
}
