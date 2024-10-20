package defpackage;

import defpackage.aoyi;
import defpackage.aoyj;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aoyj<MessageType extends aoyj<MessageType, BuilderType>, BuilderType extends aoyi<MessageType, BuilderType>> implements apbt {
    protected int memoizedHashCode = 0;

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        apay.b(iterable);
        if (iterable instanceof apbh) {
            List a = ((apbh) iterable).a();
            apbh apbhVar = (apbh) list;
            int size = list.size();
            for (Object obj : a) {
                if (obj == null) {
                    String str = "Element at index " + (apbhVar.size() - size) + " is null.";
                    int size2 = apbhVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        } else {
                            apbhVar.remove(size2);
                        }
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof aozb) {
                    apbhVar.b();
                } else if (obj instanceof byte[]) {
                    aozb.w((byte[]) obj);
                    apbhVar.b();
                } else {
                    apbhVar.add((String) obj);
                }
            }
            return;
        }
        if (!(iterable instanceof apcb)) {
            if (iterable instanceof Collection) {
                int size3 = ((Collection) iterable).size();
                if (list instanceof ArrayList) {
                    ((ArrayList) list).ensureCapacity(list.size() + size3);
                }
                if (list instanceof apcd) {
                    ((apcd) list).d(list.size() + size3);
                }
            }
            int size4 = list.size();
            if ((iterable instanceof List) && (iterable instanceof RandomAccess)) {
                List list2 = (List) iterable;
                int size5 = list2.size();
                for (int i = 0; i < size5; i++) {
                    a aVar = (Object) list2.get(i);
                    if (aVar == null) {
                        aoyi.i(list, size4);
                    }
                    list.add(aVar);
                }
                return;
            }
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    aoyi.i(list, size4);
                }
                list.add(obj2);
            }
            return;
        }
        list.addAll((Collection) iterable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void checkByteStringIsUtf8(aozb aozbVar) {
        if (aozbVar.r()) {
        } else {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(apcj apcjVar) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize == -1) {
            int a = apcjVar.a(this);
            setMemoizedSerializedSize(a);
            return a;
        }
        return memoizedSerializedSize;
    }

    public apby mutableCopy() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    public apcu newUninitializedMessageException() {
        return new apcu();
    }

    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.apbt
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            aozl ag = aozl.ag(bArr);
            writeTo(ag);
            ag.ah();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    @Override // defpackage.apbt
    public aozb toByteString() {
        try {
            int serializedSize = getSerializedSize();
            aozb aozbVar = aozb.b;
            byte[] bArr = new byte[serializedSize];
            aozl ag = aozl.ag(bArr);
            writeTo(ag);
            return aowt.a(ag, bArr);
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        aozi aoziVar = new aozi(outputStream, aozl.S(aozl.ab(serializedSize) + serializedSize));
        aoziVar.C(serializedSize);
        writeTo(aoziVar);
        aoziVar.i();
    }

    @Override // defpackage.apbt
    public void writeTo(OutputStream outputStream) {
        aozi aoziVar = new aozi(outputStream, aozl.S(getSerializedSize()));
        writeTo(aoziVar);
        aoziVar.i();
    }
}
