package google.internal.communications.instantmessaging.v1;

import defpackage.aoyj;
import defpackage.aozb;
import defpackage.aozg;
import defpackage.aozs;
import defpackage.aozz;
import defpackage.apaf;
import defpackage.apag;
import defpackage.apax;
import defpackage.apbu;
import defpackage.apca;
import defpackage.aqfv;
import defpackage.aqfw;
import defpackage.aqfx;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class TachyonCommon$PublicPreKeySets extends apag<TachyonCommon$PublicPreKeySets, aqfx> implements apbu {
    private static final TachyonCommon$PublicPreKeySets DEFAULT_INSTANCE;
    private static volatile apca<TachyonCommon$PublicPreKeySets> PARSER = null;
    public static final int SETS_FIELD_NUMBER = 1;
    private apax<aqfv> sets_ = emptyProtobufList();

    static {
        TachyonCommon$PublicPreKeySets tachyonCommon$PublicPreKeySets = new TachyonCommon$PublicPreKeySets();
        DEFAULT_INSTANCE = tachyonCommon$PublicPreKeySets;
        apag.registerDefaultInstance(TachyonCommon$PublicPreKeySets.class, tachyonCommon$PublicPreKeySets);
    }

    private TachyonCommon$PublicPreKeySets() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSets(Iterable<? extends aqfv> iterable) {
        ensureSetsIsMutable();
        aoyj.addAll(iterable, this.sets_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSets(int i, aqfv aqfvVar) {
        aqfvVar.getClass();
        ensureSetsIsMutable();
        this.sets_.add(i, aqfvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSets() {
        this.sets_ = emptyProtobufList();
    }

    private void ensureSetsIsMutable() {
        apax<aqfv> apaxVar = this.sets_;
        if (!apaxVar.c()) {
            this.sets_ = apag.mutableCopy(apaxVar);
        }
    }

    public static TachyonCommon$PublicPreKeySets getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aqfx newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TachyonCommon$PublicPreKeySets parseDelimitedFrom(InputStream inputStream) {
        return (TachyonCommon$PublicPreKeySets) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(aozb aozbVar) {
        return (TachyonCommon$PublicPreKeySets) apag.parseFrom(DEFAULT_INSTANCE, aozbVar);
    }

    public static apca<TachyonCommon$PublicPreKeySets> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSets(int i) {
        ensureSetsIsMutable();
        this.sets_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSets(int i, aqfv aqfvVar) {
        aqfvVar.getClass();
        ensureSetsIsMutable();
        this.sets_.set(i, aqfvVar);
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"sets_", aqfv.class});
            case NEW_MUTABLE_INSTANCE:
                return new TachyonCommon$PublicPreKeySets();
            case NEW_BUILDER:
                return new aqfx();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                apca<TachyonCommon$PublicPreKeySets> apcaVar = PARSER;
                if (apcaVar == null) {
                    synchronized (TachyonCommon$PublicPreKeySets.class) {
                        apcaVar = PARSER;
                        if (apcaVar == null) {
                            apcaVar = new aozz(DEFAULT_INSTANCE);
                            PARSER = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public aqfv getSets(int i) {
        return this.sets_.get(i);
    }

    public int getSetsCount() {
        return this.sets_.size();
    }

    public List<aqfv> getSetsList() {
        return this.sets_;
    }

    public aqfw getSetsOrBuilder(int i) {
        return this.sets_.get(i);
    }

    public List<? extends aqfw> getSetsOrBuilderList() {
        return this.sets_;
    }

    public static aqfx newBuilder(TachyonCommon$PublicPreKeySets tachyonCommon$PublicPreKeySets) {
        return DEFAULT_INSTANCE.createBuilder(tachyonCommon$PublicPreKeySets);
    }

    public static TachyonCommon$PublicPreKeySets parseDelimitedFrom(InputStream inputStream, aozs aozsVar) {
        return (TachyonCommon$PublicPreKeySets) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, aozsVar);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(aozb aozbVar, aozs aozsVar) {
        return (TachyonCommon$PublicPreKeySets) apag.parseFrom(DEFAULT_INSTANCE, aozbVar, aozsVar);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(aozg aozgVar) {
        return (TachyonCommon$PublicPreKeySets) apag.parseFrom(DEFAULT_INSTANCE, aozgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSets(aqfv aqfvVar) {
        aqfvVar.getClass();
        ensureSetsIsMutable();
        this.sets_.add(aqfvVar);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(aozg aozgVar, aozs aozsVar) {
        return (TachyonCommon$PublicPreKeySets) apag.parseFrom(DEFAULT_INSTANCE, aozgVar, aozsVar);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(InputStream inputStream) {
        return (TachyonCommon$PublicPreKeySets) apag.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(InputStream inputStream, aozs aozsVar) {
        return (TachyonCommon$PublicPreKeySets) apag.parseFrom(DEFAULT_INSTANCE, inputStream, aozsVar);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(ByteBuffer byteBuffer) {
        return (TachyonCommon$PublicPreKeySets) apag.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(ByteBuffer byteBuffer, aozs aozsVar) {
        return (TachyonCommon$PublicPreKeySets) apag.parseFrom(DEFAULT_INSTANCE, byteBuffer, aozsVar);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(byte[] bArr) {
        return (TachyonCommon$PublicPreKeySets) apag.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(byte[] bArr, aozs aozsVar) {
        return (TachyonCommon$PublicPreKeySets) apag.parseFrom(DEFAULT_INSTANCE, bArr, aozsVar);
    }
}
