package defpackage;

import defpackage.aozy;
import defpackage.apag;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class apag<MessageType extends apag<MessageType, BuilderType>, BuilderType extends aozy<MessageType, BuilderType>> extends aoyj<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Class<?>, apag<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected apcw unknownFields = apcw.a;

    /* renamed from: -$$Nest$smcheckIsLite */
    public static /* bridge */ /* synthetic */ apae m88$$Nest$smcheckIsLite(aozq aozqVar) {
        return checkIsLite(aozqVar);
    }

    public static <MessageType extends apab<MessageType, BuilderType>, BuilderType extends apaa<MessageType, BuilderType>, T> apae<MessageType, T> checkIsLite(aozq<MessageType, T> aozqVar) {
        return (apae) aozqVar;
    }

    private static <T extends apag<T, ?>> T checkMessageInitialized(T t) {
        if (t != null && !t.isInitialized()) {
            throw t.newUninitializedMessageException().a();
        }
        return t;
    }

    private int computeSerializedSize(apcj<?> apcjVar) {
        if (apcjVar == null) {
            return apcc.a.b(this).a(this);
        }
        return apcjVar.a(this);
    }

    public static apai emptyBooleanList() {
        return aoys.b;
    }

    public static apaj emptyDoubleList() {
        return aozm.b;
    }

    public static apan emptyFloatList() {
        return aozw.b;
    }

    public static apao emptyIntList() {
        return apah.a;
    }

    public static apar emptyLongList() {
        return apbk.a;
    }

    public static <E> apax<E> emptyProtobufList() {
        return apcd.b;
    }

    private void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == apcw.a) {
            this.unknownFields = new apcw();
        }
    }

    public static <T extends apag> T getDefaultInstance(Class<T> cls) {
        apag<?, ?> apagVar = defaultInstanceMap.get(cls);
        if (apagVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                apagVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (apagVar == null) {
            apagVar = ((apag) apdb.g(cls)).getDefaultInstanceForType();
            if (apagVar != null) {
                defaultInstanceMap.put(cls, apagVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return apagVar;
    }

    static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static Object newMessageInfo(apbt apbtVar, String str, Object[] objArr) {
        return new apce(apbtVar, str, objArr);
    }

    public static <ContainingType extends apbt, Type> apae<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, apbt apbtVar, apal apalVar, int i, apdf apdfVar, boolean z, Class cls) {
        return new apae<>(containingtype, apcd.b, apbtVar, new apad(apalVar, i, apdfVar, true, z));
    }

    public static <ContainingType extends apbt, Type> apae<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, apbt apbtVar, apal apalVar, int i, apdf apdfVar, Class cls) {
        return new apae<>(containingtype, type, apbtVar, new apad(apalVar, i, apdfVar, false, false));
    }

    public static <T extends apag<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream) {
        aozs aozsVar = aozs.a;
        apcc apccVar = apcc.a;
        T t2 = (T) parsePartialDelimitedFrom(t, inputStream, aozs.a);
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends apag<T, ?>> T parseFrom(T t, aozb aozbVar) {
        aozs aozsVar = aozs.a;
        apcc apccVar = apcc.a;
        T t2 = (T) parseFrom(t, aozbVar, aozs.a);
        checkMessageInitialized(t2);
        return t2;
    }

    private static <T extends apag<T, ?>> T parsePartialDelimitedFrom(T t, InputStream inputStream, aozs aozsVar) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            int i = aozg.e;
            if ((read & 128) != 0) {
                read &= 127;
                int i2 = 7;
                while (true) {
                    if (i2 < 32) {
                        int read2 = inputStream.read();
                        if (read2 != -1) {
                            read |= (read2 & 127) << i2;
                            if ((read2 & 128) == 0) {
                                break;
                            }
                            i2 += 7;
                        } else {
                            throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                    } else {
                        while (i2 < 64) {
                            int read3 = inputStream.read();
                            if (read3 != -1) {
                                if ((read3 & 128) != 0) {
                                    i2 += 7;
                                }
                            } else {
                                throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                            }
                        }
                        throw new apba("CodedInputStream encountered a malformed varint.");
                    }
                }
            }
            aozg J = aozg.J(new aoyh(inputStream, read));
            T t2 = (T) parsePartialFrom(t, J, aozsVar);
            J.z(0);
            return t2;
        } catch (apba e) {
            if (e.a) {
                throw new apba(e);
            }
            throw e;
        } catch (IOException e2) {
            throw new apba(e2);
        }
    }

    private static <T extends apag<T, ?>> T parsePartialFrom(T t, aozb aozbVar, aozs aozsVar) {
        aozg l = aozbVar.l();
        T t2 = (T) parsePartialFrom(t, l, aozsVar);
        l.z(0);
        return t2;
    }

    public static <T extends apag> void registerDefaultInstance(Class<T> cls, T t) {
        t.markImmutable();
        defaultInstanceMap.put(cls, t);
    }

    public Object buildMessageInfo() {
        return dynamicMethod(apaf.BUILD_MESSAGE_INFO);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int computeHashCode() {
        return apcc.a.b(this).b(this);
    }

    public final <MessageType extends apag<MessageType, BuilderType>, BuilderType extends aozy<MessageType, BuilderType>> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(apaf.NEW_BUILDER);
    }

    protected Object dynamicMethod(apaf apafVar) {
        return dynamicMethod(apafVar, null, null);
    }

    protected abstract Object dynamicMethod(apaf apafVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return apcc.a.b(this).j(this, (apag) obj);
    }

    @Override // defpackage.apbu
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(apaf.GET_DEFAULT_INSTANCE);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    @Override // defpackage.aoyj
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // defpackage.apbt
    public final apca<MessageType> getParserForType() {
        return (apca) dynamicMethod(apaf.GET_PARSER);
    }

    @Override // defpackage.apbt
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        if (getMemoizedHashCode() == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.apbu
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public boolean isMutable() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return true;
        }
        return false;
    }

    public void makeImmutable() {
        apcc.a.b(this).g(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    protected void mergeLengthDelimitedField(int i, aozb aozbVar) {
        ensureUnknownFieldsInitialized();
        apcw apcwVar = this.unknownFields;
        apcwVar.c();
        if (i != 0) {
            apcwVar.f(apdh.c(i, 2), aozbVar);
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    protected final void mergeUnknownFields(apcw apcwVar) {
        this.unknownFields = apcw.b(this.unknownFields, apcwVar);
    }

    protected void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        apcw apcwVar = this.unknownFields;
        apcwVar.c();
        if (i != 0) {
            apcwVar.f(apdh.c(i, 0), Long.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    @Override // defpackage.aoyj
    public apby mutableCopy() {
        throw new UnsupportedOperationException("Lite does not support the mutable API.");
    }

    @Override // defpackage.apbt
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(apaf.NEW_BUILDER);
    }

    public MessageType newMutableInstance() {
        return (MessageType) dynamicMethod(apaf.NEW_MUTABLE_INSTANCE);
    }

    protected boolean parseUnknownField(int i, aozg aozgVar) {
        if (apdh.b(i) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.g(i, aozgVar);
    }

    public void setMemoizedHashCode(int i) {
        this.memoizedHashCode = i;
    }

    @Override // defpackage.aoyj
    public void setMemoizedSerializedSize(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = i | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException(a.bV(i, "serialized size must be non-negative, was "));
    }

    @Override // defpackage.apbt
    public final BuilderType toBuilder() {
        BuilderType buildertype = (BuilderType) dynamicMethod(apaf.NEW_BUILDER);
        buildertype.w(this);
        return buildertype;
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        apbv.b(this, sb, 0);
        return sb.toString();
    }

    @Override // defpackage.apbt
    public void writeTo(aozl aozlVar) {
        apcj b = apcc.a.b(this);
        aojj aojjVar = aozlVar.f;
        if (aojjVar == null) {
            aojjVar = new aojj(aozlVar);
        }
        b.m(this, aojjVar);
    }

    public static final <T extends apag<T, ?>> boolean isInitialized(T t, boolean z) {
        byte byteValue = ((Byte) t.dynamicMethod(apaf.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean k = apcc.a.b(t).k(t);
        if (z) {
            t.dynamicMethod(apaf.SET_MEMOIZED_IS_INITIALIZED, true != k ? null : t);
        }
        return k;
    }

    public static apai mutableCopy(apai apaiVar) {
        int size = apaiVar.size();
        return apaiVar.e(size + size);
    }

    public final <MessageType extends apag<MessageType, BuilderType>, BuilderType extends aozy<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        BuilderType createBuilder = createBuilder();
        createBuilder.w(messagetype);
        return createBuilder;
    }

    protected Object dynamicMethod(apaf apafVar, Object obj) {
        return dynamicMethod(apafVar, obj, null);
    }

    @Override // defpackage.aoyj
    public int getSerializedSize(apcj apcjVar) {
        if (isMutable()) {
            int computeSerializedSize = computeSerializedSize(apcjVar);
            if (computeSerializedSize >= 0) {
                return computeSerializedSize;
            }
            throw new IllegalStateException(a.bV(computeSerializedSize, "serialized size must be non-negative, was "));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        int computeSerializedSize2 = computeSerializedSize(apcjVar);
        setMemoizedSerializedSize(computeSerializedSize2);
        return computeSerializedSize2;
    }

    protected static apaj mutableCopy(apaj apajVar) {
        int size = apajVar.size();
        return apajVar.e(size + size);
    }

    protected static <T extends apag<T, ?>> T parsePartialFrom(T t, aozg aozgVar) {
        aozs aozsVar = aozs.a;
        apcc apccVar = apcc.a;
        return (T) parsePartialFrom(t, aozgVar, aozs.a);
    }

    public static <T extends apag<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream, aozs aozsVar) {
        T t2 = (T) parsePartialDelimitedFrom(t, inputStream, aozsVar);
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends apag<T, ?>> T parseFrom(T t, aozb aozbVar, aozs aozsVar) {
        T t2 = (T) parsePartialFrom(t, aozbVar, aozsVar);
        checkMessageInitialized(t2);
        return t2;
    }

    public static apan mutableCopy(apan apanVar) {
        int size = apanVar.size();
        return apanVar.e(size + size);
    }

    public static <T extends apag<T, ?>> T parseFrom(T t, aozg aozgVar) {
        aozs aozsVar = aozs.a;
        apcc apccVar = apcc.a;
        return (T) parseFrom(t, aozgVar, aozs.a);
    }

    public static <T extends apag<T, ?>> T parsePartialFrom(T t, aozg aozgVar, aozs aozsVar) {
        T t2 = (T) t.newMutableInstance();
        try {
            apcj b = apcc.a.b(t2);
            b.l(t2, aozh.p(aozgVar), aozsVar);
            b.g(t2);
            return t2;
        } catch (apba e) {
            if (e.a) {
                throw new apba(e);
            }
            throw e;
        } catch (apcu e2) {
            throw e2.a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof apba) {
                throw ((apba) e3.getCause());
            }
            throw new apba(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof apba) {
                throw ((apba) e4.getCause());
            }
            throw e4;
        }
    }

    public static apao mutableCopy(apao apaoVar) {
        int size = apaoVar.size();
        return apaoVar.e(size + size);
    }

    public static <T extends apag<T, ?>> T parseFrom(T t, aozg aozgVar, aozs aozsVar) {
        T t2 = (T) parsePartialFrom(t, aozgVar, aozsVar);
        checkMessageInitialized(t2);
        return t2;
    }

    public static apar mutableCopy(apar aparVar) {
        int size = aparVar.size();
        return aparVar.e(size + size);
    }

    public static <T extends apag<T, ?>> T parseFrom(T t, InputStream inputStream) {
        aozg J = aozg.J(inputStream);
        aozs aozsVar = aozs.a;
        apcc apccVar = apcc.a;
        T t2 = (T) parsePartialFrom(t, J, aozs.a);
        checkMessageInitialized(t2);
        return t2;
    }

    public static <E> apax<E> mutableCopy(apax<E> apaxVar) {
        int size = apaxVar.size();
        return apaxVar.e(size + size);
    }

    public static <T extends apag<T, ?>> T parseFrom(T t, InputStream inputStream, aozs aozsVar) {
        T t2 = (T) parsePartialFrom(t, aozg.J(inputStream), aozsVar);
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends apag<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer) {
        aozs aozsVar = aozs.a;
        apcc apccVar = apcc.a;
        return (T) parseFrom(t, byteBuffer, aozs.a);
    }

    public static <T extends apag<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer, aozs aozsVar) {
        T t2 = (T) parseFrom(t, aozg.K(byteBuffer), aozsVar);
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends apag<T, ?>> T parseFrom(T t, byte[] bArr) {
        int length = bArr.length;
        aozs aozsVar = aozs.a;
        apcc apccVar = apcc.a;
        T t2 = (T) parsePartialFrom(t, bArr, 0, length, aozs.a);
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends apag<T, ?>> T parsePartialFrom(T t, byte[] bArr, int i, int i2, aozs aozsVar) {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.newMutableInstance();
        try {
            apcj b = apcc.a.b(t2);
            b.i(t2, bArr, i, i + i2, new aoyp(aozsVar));
            b.g(t2);
            return t2;
        } catch (apba e) {
            if (e.a) {
                throw new apba(e);
            }
            throw e;
        } catch (apcu e2) {
            throw e2.a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof apba) {
                throw ((apba) e3.getCause());
            }
            throw new apba(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static <T extends apag<T, ?>> T parseFrom(T t, byte[] bArr, aozs aozsVar) {
        T t2 = (T) parsePartialFrom(t, bArr, 0, bArr.length, aozsVar);
        checkMessageInitialized(t2);
        return t2;
    }
}
