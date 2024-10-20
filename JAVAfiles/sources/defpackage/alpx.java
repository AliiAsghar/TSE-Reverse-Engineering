package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class alpx<K, V> extends alpg<K, V> implements altk<K, V> {
    private static final long serialVersionUID = 0;
    private transient alpx a;
    private transient alpt b;
    private final transient alpt<V> emptySet;

    public alpx(alor alorVar, int i) {
        super(alorVar, i);
        this.emptySet = A(null);
    }

    private static alpt A(Comparator comparator) {
        if (comparator == null) {
            return altg.a;
        }
        return alqf.G(comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        alpr alqdVar;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            alok alokVar = new alok();
            int i = 0;
            for (int i2 = 0; i2 < readInt; i2++) {
                Object readObject = objectInputStream.readObject();
                readObject.getClass();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    if (comparator == null) {
                        alqdVar = new alpr();
                    } else {
                        alqdVar = new alqd(comparator);
                    }
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        Object readObject2 = objectInputStream.readObject();
                        readObject2.getClass();
                        alqdVar.c(readObject2);
                    }
                    alpt g = alqdVar.g();
                    if (g.size() == readInt2) {
                        alokVar.h(readObject, g);
                        i += readInt2;
                    } else {
                        throw new InvalidObjectException("Duplicate key-value pairs exist for key ".concat(readObject.toString()));
                    }
                } else {
                    throw new InvalidObjectException(a.bV(readInt2, "Invalid value count "));
                }
            }
            try {
                alpe.a.L(this, alokVar.b());
                alpe.b.K(this, i);
                alpw.a.L(this, A(comparator));
                return;
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        }
        throw new InvalidObjectException(a.bV(readInt, "Invalid key count "));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        Comparator comparator;
        objectOutputStream.defaultWriteObject();
        alpt<V> alptVar = this.emptySet;
        if (alptVar instanceof alqf) {
            comparator = ((alqf) alptVar).a;
        } else {
            comparator = null;
        }
        objectOutputStream.writeObject(comparator);
        alzz.T(this, objectOutputStream);
    }

    @Override // defpackage.alpg
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ alnu z(Object obj) {
        throw null;
    }

    @Override // defpackage.alpg
    /* renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final alpt r() {
        alpt alptVar = this.b;
        if (alptVar == null) {
            alpv alpvVar = new alpv(this);
            this.b = alpvVar;
            return alpvVar;
        }
        return alptVar;
    }

    @Override // defpackage.altk
    /* renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final alpt z(Object obj) {
        return (alpt) albo.ak((alpt) this.map.get(obj), this.emptySet);
    }

    public final alpx p() {
        alpx alpxVar = this.a;
        if (alpxVar == null) {
            alpu alpuVar = new alpu();
            aluq listIterator = d().listIterator();
            while (listIterator.hasNext()) {
                Map.Entry entry = (Map.Entry) listIterator.next();
                alpuVar.b(entry.getValue(), entry.getKey());
            }
            alpx a = alpuVar.a();
            a.a = this;
            this.a = a;
            return a;
        }
        return alpxVar;
    }

    @Override // defpackage.alpg, defpackage.alli, defpackage.alrz
    public final /* bridge */ /* synthetic */ Collection r() {
        throw null;
    }
}
