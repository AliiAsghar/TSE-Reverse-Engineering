package defpackage;

import android.os.Build;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiel {
    public static final /* synthetic */ int a = 0;
    private static final alor b;
    private final alex c;

    static {
        alok alokVar = new alok();
        alokVar.h("arm64-v8a", alew.ARM_64);
        alokVar.h("armeabi-v7a", alew.ARM_32);
        alokVar.h("x86_64", alew.X86_64);
        alokVar.h("x86", alew.X86_32);
        b = alokVar.b();
    }

    public aiel(String str) {
        aozy createBuilder = alex.a.createBuilder();
        String str2 = Build.BOARD;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        alex alexVar = (alex) createBuilder.b;
        str2.getClass();
        alexVar.d = str2;
        String str3 = Build.VERSION.RELEASE;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        str3.getClass();
        ((alex) apagVar).f = str3;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((alex) createBuilder.b).b = a.ak(5);
        if (Build.SUPPORTED_ABIS.length > 0) {
            alor alorVar = b;
            if (alorVar.containsKey(albo.ap(Build.SUPPORTED_ABIS[0]))) {
                alew alewVar = (alew) alorVar.getOrDefault(albo.ap(Build.SUPPORTED_ABIS[0]), alew.UNKNOWN_ARCH);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((alex) createBuilder.b).c = alewVar.a();
            }
        }
        if (!albo.ah(str)) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((alex) createBuilder.b).g = str;
        }
        this.c = (alex) createBuilder.s();
    }

    public final alex a(ales alesVar, alqf alqfVar) {
        alew alewVar;
        aozy createBuilder = alex.a.createBuilder();
        Iterator<E> it = new apaq(alesVar.n, ales.a).iterator();
        while (it.hasNext()) {
            int i = 5;
            int i2 = 1;
            switch (((aley) it.next()).ordinal()) {
                case 0:
                    int Z = a.Z(this.c.b);
                    if (Z != 0) {
                        i2 = Z;
                    }
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((alex) createBuilder.b).b = a.ak(i2);
                    break;
                case 1:
                    int i3 = this.c.c;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 != 4) {
                                        if (i3 != 5) {
                                            alewVar = null;
                                        } else {
                                            alewVar = alew.ARM_32;
                                        }
                                    } else {
                                        alewVar = alew.X86_32;
                                    }
                                } else {
                                    alewVar = alew.X86;
                                }
                            } else {
                                alewVar = alew.ARM_64;
                            }
                        } else {
                            alewVar = alew.X86_64;
                        }
                    } else {
                        alewVar = alew.UNKNOWN_ARCH;
                    }
                    if (alewVar == null) {
                        alewVar = alew.UNRECOGNIZED;
                    }
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((alex) createBuilder.b).c = alewVar.a();
                    break;
                case 2:
                    String str = this.c.d;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    alex alexVar = (alex) createBuilder.b;
                    str.getClass();
                    alexVar.d = str;
                    break;
                case 3:
                    String str2 = this.c.e;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    alex alexVar2 = (alex) createBuilder.b;
                    str2.getClass();
                    alexVar2.e = str2;
                    break;
                case 4:
                    String str3 = this.c.f;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    alex alexVar3 = (alex) createBuilder.b;
                    str3.getClass();
                    alexVar3.f = str3;
                    break;
                case 5:
                    String str4 = this.c.g;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    alex alexVar4 = (alex) createBuilder.b;
                    str4.getClass();
                    alexVar4.g = str4;
                    break;
                case 6:
                    String str5 = this.c.h;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    alex alexVar5 = (alex) createBuilder.b;
                    str5.getClass();
                    alexVar5.h = str5;
                    break;
                case 7:
                    int T = a.T(this.c.i);
                    if (T != 0) {
                        i2 = T;
                    }
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((alex) createBuilder.b).i = a.am(i2);
                    break;
                case 8:
                    Stream filter = Collection.EL.stream(alqfVar).filter(new agol(alesVar, i));
                    int i4 = alog.d;
                    Iterable iterable = (Iterable) filter.collect(alls.a);
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    alex alexVar6 = (alex) createBuilder.b;
                    apar aparVar = alexVar6.j;
                    if (!aparVar.c()) {
                        alexVar6.j = apag.mutableCopy(aparVar);
                    }
                    aoyj.addAll(iterable, alexVar6.j);
                    break;
                case 9:
                    throw new AssertionError("Unrecognized SystemProfileField");
            }
        }
        return (alex) createBuilder.s();
    }
}
