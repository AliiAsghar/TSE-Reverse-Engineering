package defpackage;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arox implements Externalizable {
    private static final long serialVersionUID = 0;
    private Map a;

    public arox(Map map) {
        this.a = map;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        objectInput.getClass();
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                aros arosVar = new aros(readInt);
                for (int i = 0; i < readInt; i++) {
                    arosVar.put(objectInput.readObject(), objectInput.readObject());
                }
                this.a = arosVar.e();
                return;
            }
            throw new InvalidObjectException(a.cb(readInt, "Illegal size value: ", "."));
        }
        throw new InvalidObjectException(a.bV(readByte, "Unsupported flags value: "));
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.getClass();
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }

    public arox() {
        this(arnw.a);
    }
}
