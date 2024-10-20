package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aogi implements aogb {
    public static final aofz a;
    public static final aofz b;
    private static final Charset d = Charset.forName("UTF-8");
    private static final aoga e;
    public final Map c;
    private OutputStream f;
    private final Map g;
    private final aoga h;
    private final aode i = new aode();

    static {
        aohs aohsVar = new aohs("key");
        aohsVar.d(new aogd(1, aogg.DEFAULT));
        a = aohsVar.c();
        aohs aohsVar2 = new aohs(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE);
        aohsVar2.d(new aogd(2, aogg.DEFAULT));
        b = aohsVar2.c();
        e = new aogj(1);
    }

    public aogi(OutputStream outputStream, Map map, Map map2, aoga aogaVar) {
        this.f = outputStream;
        this.c = map;
        this.g = map2;
        this.h = aogaVar;
    }

    private static int g(aofz aofzVar) {
        aogh aoghVar = (aogh) aofzVar.a(aogh.class);
        if (aoghVar != null) {
            return aoghVar.a();
        }
        throw new aofy("Field has no @Protobuf config");
    }

    private static aogh h(aofz aofzVar) {
        aogh aoghVar = (aogh) aofzVar.a(aogh.class);
        if (aoghVar != null) {
            return aoghVar;
        }
        throw new aofy("Field has no @Protobuf config");
    }

    private static ByteBuffer i(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void j(int i) {
        while (true) {
            int i2 = i & 127;
            if ((i & (-128)) != 0) {
                this.f.write(i2 | 128);
                i >>>= 7;
            } else {
                this.f.write(i2);
                return;
            }
        }
    }

    private final void k(long j) {
        while (true) {
            int i = ((int) j) & 127;
            if (((-128) & j) != 0) {
                this.f.write(i | 128);
                j >>>= 7;
            } else {
                this.f.write(i);
                return;
            }
        }
    }

    private final void l(aoga aogaVar, aofz aofzVar, Object obj, boolean z) {
        aoge aogeVar = new aoge();
        try {
            OutputStream outputStream = this.f;
            this.f = aogeVar;
            try {
                aogaVar.a(obj, this);
                this.f = outputStream;
                long j = aogeVar.a;
                aogeVar.close();
                if (z && j == 0) {
                    return;
                }
                j((g(aofzVar) << 3) | 2);
                k(j);
                aogaVar.a(obj, this);
            } catch (Throwable th) {
                this.f = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                aogeVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // defpackage.aogb
    public final /* bridge */ /* synthetic */ void a(aofz aofzVar, long j) {
        d(aofzVar, j, true);
    }

    @Override // defpackage.aogb
    public final void b(aofz aofzVar, Object obj) {
        f(aofzVar, obj, true);
    }

    final void c(aofz aofzVar, int i, boolean z) {
        if (!z || i != 0) {
            aogh h = h(aofzVar);
            int ordinal = h.b().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        return;
                    }
                    j((h.a() << 3) | 5);
                    this.f.write(i(4).putInt(i).array());
                    return;
                }
                j(h.a() << 3);
                j((i + i) ^ (i >> 31));
                return;
            }
            j(h.a() << 3);
            j(i);
        }
    }

    final void d(aofz aofzVar, long j, boolean z) {
        if (!z || j != 0) {
            aogh h = h(aofzVar);
            int ordinal = h.b().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        return;
                    }
                    j((h.a() << 3) | 1);
                    this.f.write(i(8).putLong(j).array());
                    return;
                }
                j(h.a() << 3);
                k((j >> 63) ^ (j + j));
                return;
            }
            j(h.a() << 3);
            k(j);
        }
    }

    public final void e(aofz aofzVar, int i) {
        c(aofzVar, i, true);
    }

    final void f(aofz aofzVar, Object obj, boolean z) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    j((g(aofzVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(d);
                    j(bytes.length);
                    this.f.write(bytes);
                    return;
                }
                return;
            }
            if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    f(aofzVar, it.next(), false);
                }
                return;
            }
            if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    l(e, aofzVar, (Map.Entry) it2.next(), false);
                }
                return;
            }
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (!z || doubleValue != 0.0d) {
                    j((g(aofzVar) << 3) | 1);
                    this.f.write(i(8).putDouble(doubleValue).array());
                    return;
                }
                return;
            }
            if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z || floatValue != brg.a) {
                    j((g(aofzVar) << 3) | 5);
                    this.f.write(i(4).putFloat(floatValue).array());
                    return;
                }
                return;
            }
            if (obj instanceof Number) {
                d(aofzVar, ((Number) obj).longValue(), z);
                return;
            }
            if (obj instanceof Boolean) {
                c(aofzVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return;
                }
                j((g(aofzVar) << 3) | 2);
                j(bArr.length);
                this.f.write(bArr);
                return;
            }
            aoga aogaVar = (aoga) this.c.get(obj.getClass());
            if (aogaVar != null) {
                l(aogaVar, aofzVar, obj, z);
                return;
            }
            aogc aogcVar = (aogc) this.g.get(obj.getClass());
            if (aogcVar != null) {
                aogcVar.a(obj, this.i);
                return;
            }
            if (obj instanceof aogf) {
                e(aofzVar, ((aogf) obj).a());
            } else if (obj instanceof Enum) {
                e(aofzVar, ((Enum) obj).ordinal());
            } else {
                l(this.h, aofzVar, obj, z);
            }
        }
    }
}
