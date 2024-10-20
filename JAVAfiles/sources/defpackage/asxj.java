package defpackage;

import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asxj extends asxn {
    public final int b;
    public asxk c;
    private final boolean d;
    private final List e;
    private final List f;
    private final long g;
    private long h;

    private asxj(int i, List list, List list2, long j, long j2, boolean z) {
        super(true);
        this.h = 0L;
        this.b = i;
        this.e = DesugarCollections.unmodifiableList(list);
        this.f = DesugarCollections.unmodifiableList(list2);
        this.h = j;
        this.g = j2;
        this.d = z;
    }

    public static asxj a(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof asxj) {
            return (asxj) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            if (dataInputStream2.readInt() == 0) {
                int readInt = dataInputStream2.readInt();
                long readLong = dataInputStream2.readLong();
                long readLong2 = dataInputStream2.readLong();
                boolean readBoolean = dataInputStream2.readBoolean();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < readInt; i++) {
                    arrayList.add(asxp.a(obj));
                }
                for (int i2 = 0; i2 < readInt - 1; i2++) {
                    arrayList2.add(asxr.a(obj));
                }
                return new asxj(readInt, arrayList, arrayList2, readLong, readLong2, readBoolean);
            }
            throw new IllegalStateException("unknown version for hss private key");
        }
        if (obj instanceof byte[]) {
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th) {
                th = th;
                dataInputStream = null;
            }
            try {
                asxj a = a(dataInputStream);
                dataInputStream.close();
                return a;
            } catch (Throwable th2) {
                th = th2;
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                throw th;
            }
        }
        if (obj instanceof InputStream) {
            return a(atow.A((InputStream) obj));
        }
        throw new IllegalArgumentException("cannot parse ".concat(String.valueOf(String.valueOf(obj))));
    }

    public final synchronized asxk b() {
        return new asxk(this.b, ((asxp) this.e.get(0)).b());
    }

    protected final Object clone() {
        try {
            return a(s());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        asxj asxjVar = (asxj) obj;
        if (this.b != asxjVar.b || this.d != asxjVar.d || this.g != asxjVar.g || this.h != asxjVar.h || !this.e.equals(asxjVar.e)) {
            return false;
        }
        return this.f.equals(asxjVar.f);
    }

    public final int hashCode() {
        int hashCode = (((((this.b * 31) + (this.d ? 1 : 0)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        long j = this.h;
        long j2 = j ^ (j >>> 32);
        long j3 = this.g;
        return (((hashCode * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) j2);
    }

    @Override // defpackage.asxn, defpackage.atdc
    public final synchronized byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream;
        byteArrayOutputStream = new ByteArrayOutputStream();
        atow.aO(0, byteArrayOutputStream);
        atow.aO(this.b, byteArrayOutputStream);
        atow.aP(this.h, byteArrayOutputStream);
        atow.aP(this.g, byteArrayOutputStream);
        byteArrayOutputStream.write(this.d ? 1 : 0);
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            atow.aL((asxp) it.next(), byteArrayOutputStream);
        }
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            atow.aL((asxr) it2.next(), byteArrayOutputStream);
        }
        return byteArrayOutputStream.toByteArray();
    }
}
