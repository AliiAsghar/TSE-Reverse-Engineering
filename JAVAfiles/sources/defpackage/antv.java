package defpackage;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class antv {
    public final Object a;
    public final Object b;
    public final /* synthetic */ Object c;

    public antv(ahvw ahvwVar, String str, final int i, final int i2) {
        this.c = ahvwVar;
        this.b = str;
        this.a = new ahvt(new alhr() { // from class: ahvv
            @Override // defpackage.alhr
            public final Object get() {
                aozy createBuilder = aocw.a.createBuilder();
                antv antvVar = antv.this;
                int i3 = i;
                try {
                    Resources a = ((ahvw) antvVar.c).a();
                    if (a == null) {
                        Log.i("PhenotypeResourceReader", "Failed to read Phenotype registration resources from " + ((ahvw) antvVar.c).a);
                        return null;
                    }
                    try {
                        antvVar.a(createBuilder, a, i3);
                        long longValue = ((Long) ((ahvw) antvVar.c).b.get()).longValue();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        aocw aocwVar = (aocw) createBuilder.b;
                        aocwVar.b |= 128;
                        aocwVar.l = longValue;
                        String str2 = aocwVar.g;
                        int indexOf = str2.indexOf(35);
                        if (indexOf >= 0) {
                            str2 = str2.substring(0, indexOf);
                        }
                        Object obj = antvVar.b;
                        albo.X(str2.equals(obj), "Resource package does not match expected package, expected package: %s", obj);
                        aocw aocwVar2 = (aocw) createBuilder.b;
                        String str3 = aocwVar2.g;
                        Object obj2 = antvVar.c;
                        boolean z = aocwVar2.h;
                        if (!str3.isEmpty()) {
                            if (z) {
                                if (str3.indexOf(35) < 0) {
                                    str3 = str3 + "#" + ((ahvw) obj2).a;
                                } else {
                                    throw new IllegalArgumentException(String.format("When %s is present, %s should not contain subpackage separator %s (config package=%s)", "auto-subpackage", "configuration-package", '#', str3));
                                }
                            }
                            if (((aocw) createBuilder.b).c != 2) {
                                Integer num = (Integer) ((ahvw) antvVar.c).c.get();
                                num.intValue();
                                if (!createBuilder.b.isMutable()) {
                                    createBuilder.u();
                                }
                                aocw aocwVar3 = (aocw) createBuilder.b;
                                aocwVar3.c = 2;
                                aocwVar3.d = num;
                            }
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            apag apagVar = createBuilder.b;
                            aocw aocwVar4 = (aocw) apagVar;
                            str3.getClass();
                            aocwVar4.b |= 1;
                            aocwVar4.g = str3;
                            Object obj3 = antvVar.c;
                            if (!apagVar.isMutable()) {
                                createBuilder.u();
                            }
                            String str4 = ((ahvw) obj3).a;
                            apag apagVar2 = createBuilder.b;
                            aocw aocwVar5 = (aocw) apagVar2;
                            str4.getClass();
                            aocwVar5.e = 7;
                            aocwVar5.f = str4;
                            if (!apagVar2.isMutable()) {
                                createBuilder.u();
                            }
                            int i4 = i2;
                            aocw aocwVar6 = (aocw) createBuilder.b;
                            aocwVar6.k = 3;
                            aocwVar6.b |= 32;
                            if (i4 == 0) {
                                return (aocw) createBuilder.s();
                            }
                            aozy createBuilder2 = ahvs.a.createBuilder();
                            try {
                                antvVar.a(createBuilder2, a, i4);
                                albo.Z(((ahvs) createBuilder2.b).c.equals(antvVar.b), "Package in HeterodyneInfo binary %s does not match resource lookup for %s", ((ahvs) createBuilder2.b).c, antvVar.b);
                                if (!createBuilder2.b.isMutable()) {
                                    createBuilder2.u();
                                }
                                ahvs ahvsVar = (ahvs) createBuilder2.b;
                                ahvsVar.b &= -2;
                                ahvsVar.c = ahvs.a.c;
                                aozb byteString = ((ahvs) createBuilder2.s()).toByteString();
                                if (!createBuilder.b.isMutable()) {
                                    createBuilder.u();
                                }
                                aocw aocwVar7 = (aocw) createBuilder.b;
                                aocwVar7.b |= 256;
                                aocwVar7.m = byteString;
                                return (aocw) createBuilder.s();
                            } catch (IOException unused) {
                                Log.i("PhenotypeResourceReader", "Failed to read Phenotype HeterodyneInfo resources from ".concat(String.valueOf(((ahvw) antvVar.c).a)));
                                return null;
                            }
                        }
                        throw new IllegalArgumentException("Empty configuration package");
                    } catch (IOException | NullPointerException unused2) {
                        Log.i("PhenotypeResourceReader", "Failed to read Phenotype registration resources from ".concat(String.valueOf(((ahvw) antvVar.c).a)));
                        return null;
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    Log.i("PhenotypeResourceReader", "Failed to read Phenotype registration resources from ".concat(String.valueOf(((ahvw) antvVar.c).a)));
                    return null;
                }
            }
        });
    }

    public final void a(apbs apbsVar, Resources resources, int i) {
        InputStream openRawResource = resources.openRawResource(i);
        try {
            ((ahvw) this.c).e.a++;
            ((aozy) apbsVar).k(aozg.M(openRawResource, Math.max(512, Math.min(4096, openRawResource.available()))), aozs.a());
            if (openRawResource != null) {
                openRawResource.close();
            }
        } catch (Throwable th) {
            if (openRawResource != null) {
                try {
                    openRawResource.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public antv(Class cls, Class cls2, antu antuVar) {
        this.c = antuVar;
        this.a = cls;
        this.b = cls2;
    }

    public antv(Object obj, Class cls, Object obj2) {
        this.c = obj2;
        this.b = obj;
        this.a = cls;
    }
}
