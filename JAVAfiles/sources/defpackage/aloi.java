package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aloi extends alpg implements alqu {
    private static final long serialVersionUID = 0;
    public transient aloi b;

    public aloi(alor alorVar, int i) {
        super(alorVar, i);
    }

    public static aloi g(Object obj, Object obj2) {
        aloh alohVar = new aloh();
        alohVar.b(obj, obj2);
        return alohVar.a();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            alok alokVar = new alok();
            int i = 0;
            for (int i2 = 0; i2 < readInt; i2++) {
                Object readObject = objectInputStream.readObject();
                readObject.getClass();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    alob alobVar = new alob();
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        Object readObject2 = objectInputStream.readObject();
                        readObject2.getClass();
                        alobVar.h(readObject2);
                    }
                    alokVar.h(readObject, alobVar.g());
                    i += readInt2;
                } else {
                    throw new InvalidObjectException(a.bV(readInt2, "Invalid value count "));
                }
            }
            try {
                alpe.a.L(this, alokVar.b());
                alpe.b.K(this, i);
                return;
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        }
        throw new InvalidObjectException(a.bV(readInt, "Invalid key count "));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        alzz.T(this, objectOutputStream);
    }

    @Override // defpackage.alpg, defpackage.alrz
    /* renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final alog z(Object obj) {
        alog alogVar = (alog) this.map.get(obj);
        if (alogVar == null) {
            int i = alog.d;
            return alsx.a;
        }
        return alogVar;
    }

    @Override // defpackage.alqu
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ List b(Object obj) {
        throw null;
    }
}
