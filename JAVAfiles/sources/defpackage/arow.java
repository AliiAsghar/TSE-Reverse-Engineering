package defpackage;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arow implements Externalizable {
    private static final long serialVersionUID = 0;
    private Collection a;
    private final int b;

    public arow(Collection collection, int i) {
        this.a = collection;
        this.b = i;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Collection x;
        objectInput.getClass();
        byte readByte = objectInput.readByte();
        int i = readByte & 1;
        if ((readByte & (-2)) == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                int i2 = 0;
                if (i != 0) {
                    aroy aroyVar = new aroy(new aros(readInt));
                    while (i2 < readInt) {
                        aroyVar.add(objectInput.readObject());
                        i2++;
                    }
                    x = aqjn.d(aroyVar);
                } else {
                    aron aronVar = new aron(readInt);
                    while (i2 < readInt) {
                        aronVar.add(objectInput.readObject());
                        i2++;
                    }
                    x = aqjn.x(aronVar);
                }
                this.a = x;
                return;
            }
            throw new InvalidObjectException(a.cb(readInt, "Illegal size value: ", "."));
        }
        throw new InvalidObjectException(a.cb(readByte, "Unsupported flags value: ", "."));
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.getClass();
        objectOutput.writeByte(this.b);
        objectOutput.writeInt(this.a.size());
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    public arow() {
        this(arnv.a, 0);
    }
}
