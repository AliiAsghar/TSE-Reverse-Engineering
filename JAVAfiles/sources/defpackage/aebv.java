package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aebv implements aebs {
    private static final alvi a = alvi.m("com/google/android/libraries/abuse/hades/moirai/featureprovider/FeatureProvider");
    private final arqr b;
    private final adzy c;

    public aebv(arqr arqrVar, adzy adzyVar) {
        this.b = arqrVar;
        this.c = adzyVar;
    }

    @Override // defpackage.aebs
    public final Object a(aech aechVar, arpe arpeVar) {
        aret aretVar;
        int i;
        int i2;
        String str = null;
        if (this.b.a(aechVar) == null) {
            ((alvg) a.g().h("com/google/android/libraries/abuse/hades/moirai/featureprovider/FeatureProvider", "process", 17, "FeatureProvider.kt")).q("Nothing found to evaluate in feature provider payload.");
            return null;
        }
        adzy adzyVar = this.c;
        ByteBuffer put = ByteBuffer.allocateDirect(adzyVar.b.b.d()).put(adzyVar.b.b.o());
        put.flip();
        put.getClass();
        try {
            aretVar = new aret();
            put.order(ByteOrder.LITTLE_ENDIAN);
            aretVar.i(put.getInt(put.position()) + put.position(), put);
        } catch (Exception e) {
            ((alvg) ((alvg) adzy.a.i()).g(e).h("com/google/android/libraries/abuse/hades/moirai/blocklist/BloomFilterProcessor", "asBloom", 35, "BloomFilterProcessor.kt")).q("GetRootAsBloom throws an exception. ");
            aretVar = null;
        }
        if (aretVar != null) {
            aret aretVar2 = new aret();
            int h = aretVar.h(4);
            if (h != 0) {
                int i3 = h + aretVar.b;
                aretVar2.i(i3 + ((ByteBuffer) aretVar.c).getInt(i3), (ByteBuffer) aretVar.c);
            } else {
                aretVar2 = null;
            }
            if (aretVar2 != null) {
                int h2 = aretVar2.h(6);
                if (h2 != 0) {
                    int i4 = h2 + aretVar2.b;
                    ByteBuffer byteBuffer = (ByteBuffer) aretVar2.c;
                    int i5 = i4 + byteBuffer.getInt(i4);
                    int i6 = byteBuffer.getInt(i5);
                    int i7 = i5 + 4;
                    if (byteBuffer.hasArray()) {
                        byte[] array = byteBuffer.array();
                        int arrayOffset = byteBuffer.arrayOffset() + i7;
                        int length = array.length;
                        if ((arrayOffset | i6 | ((length - arrayOffset) - i6)) >= 0) {
                            int i8 = arrayOffset + i6;
                            char[] cArr = new char[i6];
                            int i9 = 0;
                            while (arrayOffset < i8) {
                                byte b = array[arrayOffset];
                                if (!aode.aa(b)) {
                                    break;
                                }
                                arrayOffset++;
                                aode.X(b, cArr, i9);
                                i9++;
                            }
                            while (arrayOffset < i8) {
                                int i10 = arrayOffset + 1;
                                byte b2 = array[arrayOffset];
                                if (aode.aa(b2)) {
                                    aode.X(b2, cArr, i9);
                                    i9++;
                                    arrayOffset = i10;
                                    while (arrayOffset < i8) {
                                        byte b3 = array[arrayOffset];
                                        if (aode.aa(b3)) {
                                            arrayOffset++;
                                            aode.X(b3, cArr, i9);
                                            i9++;
                                        }
                                    }
                                } else {
                                    if (aode.ac(b2)) {
                                        if (i10 < i8) {
                                            i2 = i9 + 1;
                                            arrayOffset += 2;
                                            aode.Z(b2, array[i10], cArr, i9);
                                        } else {
                                            throw new IllegalArgumentException("Invalid UTF-8");
                                        }
                                    } else if (aode.ab(b2)) {
                                        if (i10 < i8 - 1) {
                                            i2 = i9 + 1;
                                            int i11 = arrayOffset + 2;
                                            arrayOffset += 3;
                                            aode.Y(b2, array[i10], array[i11], cArr, i9);
                                        } else {
                                            throw new IllegalArgumentException("Invalid UTF-8");
                                        }
                                    } else if (i10 < i8 - 2) {
                                        byte b4 = array[i10];
                                        int i12 = arrayOffset + 3;
                                        byte b5 = array[arrayOffset + 2];
                                        arrayOffset += 4;
                                        aode.W(b2, b4, b5, array[i12], cArr, i9);
                                        i9 += 2;
                                    } else {
                                        throw new IllegalArgumentException("Invalid UTF-8");
                                    }
                                    i9 = i2;
                                }
                            }
                            str = new String(cArr, 0, i9);
                        } else {
                            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(arrayOffset), Integer.valueOf(i6)));
                        }
                    } else if ((i7 | i6 | ((byteBuffer.limit() - i7) - i6)) >= 0) {
                        int i13 = i7 + i6;
                        char[] cArr2 = new char[i6];
                        int i14 = 0;
                        while (i7 < i13) {
                            byte b6 = byteBuffer.get(i7);
                            if (!aode.aa(b6)) {
                                break;
                            }
                            i7++;
                            aode.X(b6, cArr2, i14);
                            i14++;
                        }
                        while (i7 < i13) {
                            int i15 = i7 + 1;
                            byte b7 = byteBuffer.get(i7);
                            if (aode.aa(b7)) {
                                aode.X(b7, cArr2, i14);
                                i14++;
                                i7 = i15;
                                while (i7 < i13) {
                                    byte b8 = byteBuffer.get(i7);
                                    if (aode.aa(b8)) {
                                        i7++;
                                        aode.X(b8, cArr2, i14);
                                        i14++;
                                    }
                                }
                            } else {
                                if (aode.ac(b7)) {
                                    if (i15 < i13) {
                                        i = i14 + 1;
                                        i7 += 2;
                                        aode.Z(b7, byteBuffer.get(i15), cArr2, i14);
                                    } else {
                                        throw new IllegalArgumentException("Invalid UTF-8");
                                    }
                                } else if (aode.ab(b7)) {
                                    if (i15 < i13 - 1) {
                                        i = i14 + 1;
                                        int i16 = i7 + 2;
                                        i7 += 3;
                                        aode.Y(b7, byteBuffer.get(i15), byteBuffer.get(i16), cArr2, i14);
                                    } else {
                                        throw new IllegalArgumentException("Invalid UTF-8");
                                    }
                                } else if (i15 < i13 - 2) {
                                    byte b9 = byteBuffer.get(i15);
                                    int i17 = i7 + 3;
                                    byte b10 = byteBuffer.get(i7 + 2);
                                    i7 += 4;
                                    aode.W(b7, b9, b10, byteBuffer.get(i17), cArr2, i14);
                                    i14 += 2;
                                } else {
                                    throw new IllegalArgumentException("Invalid UTF-8");
                                }
                                i14 = i;
                            }
                        }
                        str = new String(cArr2, 0, i14);
                    } else {
                        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i7), Integer.valueOf(i6)));
                    }
                }
                str.getClass();
                return new aebt(str, put);
            }
        }
        ((alvg) adzy.a.i().h("com/google/android/libraries/abuse/hades/moirai/blocklist/BloomFilterProcessor", "run", 26, "BloomFilterProcessor.kt")).q("ByteBuffer Metadata is null. ");
        return null;
    }
}
