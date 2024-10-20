package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* loaded from: classes5.dex */
final class F implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;
    private byte a;
    private Object b;

    public F() {
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Object u;
        byte readByte = objectInput.readByte();
        this.a = readByte;
        switch (readByte) {
            case 1:
                int i = AbstractC0070a.c;
                u = AbstractC0070a.u(objectInput.readUTF());
                break;
            case 2:
                u = ((InterfaceC0071b) objectInput.readObject()).B((LocalTime) objectInput.readObject());
                break;
            case 3:
                u = ((ChronoLocalDateTime) objectInput.readObject()).p((ZoneOffset) objectInput.readObject()).j((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = y.d;
                int readInt = objectInput.readInt();
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                w.d.getClass();
                u = new y(LocalDate.of(readInt, readByte2, readByte3));
                break;
            case 5:
                z zVar = z.d;
                u = z.q(objectInput.readByte());
                break;
            case 6:
                p pVar = (p) objectInput.readObject();
                int readInt2 = objectInput.readInt();
                byte readByte4 = objectInput.readByte();
                byte readByte5 = objectInput.readByte();
                pVar.getClass();
                u = r.g0(pVar, readInt2, readByte4, readByte5);
                break;
            case 7:
                int readInt3 = objectInput.readInt();
                byte readByte6 = objectInput.readByte();
                byte readByte7 = objectInput.readByte();
                B.d.getClass();
                u = new D(LocalDate.of(readInt3 + 1911, readByte6, readByte7));
                break;
            case 8:
                int readInt4 = objectInput.readInt();
                byte readByte8 = objectInput.readByte();
                byte readByte9 = objectInput.readByte();
                H.d.getClass();
                u = new J(LocalDate.of(readInt4 - 543, readByte8, readByte9));
                break;
            case 9:
                int i2 = C0076g.e;
                u = new C0076g(AbstractC0070a.u(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.b = u;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                objectOutput.writeUTF(((AbstractC0070a) obj).m());
                return;
            case 2:
                ((C0075f) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((l) obj).writeExternal(objectOutput);
                return;
            case 4:
                y yVar = (y) obj;
                yVar.getClass();
                objectOutput.writeInt(j$.time.temporal.j.a(yVar, ChronoField.YEAR));
                objectOutput.writeByte(j$.time.temporal.j.a(yVar, ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.j.a(yVar, ChronoField.DAY_OF_MONTH));
                return;
            case 5:
                ((z) obj).x(objectOutput);
                return;
            case 6:
                ((r) obj).writeExternal(objectOutput);
                return;
            case 7:
                D d = (D) obj;
                d.getClass();
                objectOutput.writeInt(j$.time.temporal.j.a(d, ChronoField.YEAR));
                objectOutput.writeByte(j$.time.temporal.j.a(d, ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.j.a(d, ChronoField.DAY_OF_MONTH));
                return;
            case 8:
                J j = (J) obj;
                j.getClass();
                objectOutput.writeInt(j$.time.temporal.j.a(j, ChronoField.YEAR));
                objectOutput.writeByte(j$.time.temporal.j.a(j, ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.j.a(j, ChronoField.DAY_OF_MONTH));
                return;
            case 9:
                ((C0076g) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public F(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }
}
