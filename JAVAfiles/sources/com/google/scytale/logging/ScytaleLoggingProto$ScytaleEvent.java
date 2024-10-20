package com.google.scytale.logging;

import defpackage.aoyj;
import defpackage.aozb;
import defpackage.aozg;
import defpackage.aozs;
import defpackage.aozy;
import defpackage.aozz;
import defpackage.apaf;
import defpackage.apag;
import defpackage.apbu;
import defpackage.apca;
import defpackage.apse;
import defpackage.apsf;
import defpackage.apsg;
import defpackage.apsh;
import defpackage.apsi;
import defpackage.apsj;
import defpackage.apsk;
import defpackage.apsl;
import defpackage.apsm;
import defpackage.apsn;
import defpackage.apso;
import defpackage.apsp;
import defpackage.apsq;
import defpackage.apsr;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ScytaleLoggingProto$ScytaleEvent extends apag<ScytaleLoggingProto$ScytaleEvent, apsp> implements apbu {
    public static final int API_RESULT_FIELD_NUMBER = 2;
    public static final int DATABASE_OPEN_ERROR_FIELD_NUMBER = 3;
    public static final int DECRYPTION_SUCCESSFUL_FIELD_NUMBER = 7;
    private static final ScytaleLoggingProto$ScytaleEvent DEFAULT_INSTANCE;
    public static final int ENCRYPTION_SUCCESSFUL_FIELD_NUMBER = 9;
    public static final int FAILED_TO_DECRYPT_FIELD_NUMBER = 6;
    public static final int FAILED_TO_ENCRYPT_FIELD_NUMBER = 8;
    public static final int FTD_SHOULD_NOT_BE_SENT_FIELD_NUMBER = 11;
    public static final int KEY_TRANSPARENCY_EVENT_FIELD_NUMBER = 12;
    private static volatile apca<ScytaleLoggingProto$ScytaleEvent> PARSER = null;
    public static final int PREKEY_FETCH_COMPLETE_FIELD_NUMBER = 10;
    public static final int SCHEMA_MIGRATION_END_FIELD_NUMBER = 5;
    public static final int SCHEMA_MIGRATION_START_FIELD_NUMBER = 4;
    public static final int SET_DEVICE_ID_EVENT_FIELD_NUMBER = 13;
    public static final int TRACE_ID_FIELD_NUMBER = 1;
    private Object event_;
    private int eventCase_ = 0;
    private String traceId_ = "";

    static {
        ScytaleLoggingProto$ScytaleEvent scytaleLoggingProto$ScytaleEvent = new ScytaleLoggingProto$ScytaleEvent();
        DEFAULT_INSTANCE = scytaleLoggingProto$ScytaleEvent;
        apag.registerDefaultInstance(ScytaleLoggingProto$ScytaleEvent.class, scytaleLoggingProto$ScytaleEvent);
    }

    private ScytaleLoggingProto$ScytaleEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApiResult() {
        if (this.eventCase_ == 2) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDatabaseOpenError() {
        if (this.eventCase_ == 3) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDecryptionSuccessful() {
        if (this.eventCase_ == 7) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncryptionSuccessful() {
        if (this.eventCase_ == 9) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvent() {
        this.eventCase_ = 0;
        this.event_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailedToDecrypt() {
        if (this.eventCase_ == 6) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailedToEncrypt() {
        if (this.eventCase_ == 8) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFtdShouldNotBeSent() {
        if (this.eventCase_ == 11) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyTransparencyEvent() {
        if (this.eventCase_ == 12) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrekeyFetchComplete() {
        if (this.eventCase_ == 10) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSchemaMigrationEnd() {
        if (this.eventCase_ == 5) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSchemaMigrationStart() {
        if (this.eventCase_ == 4) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSetDeviceIdEvent() {
        if (this.eventCase_ == 13) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTraceId() {
        this.traceId_ = getDefaultInstance().getTraceId();
    }

    public static ScytaleLoggingProto$ScytaleEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeApiResult(apse apseVar) {
        apseVar.getClass();
        aoyj aoyjVar = apseVar;
        if (this.eventCase_ == 2) {
            aoyjVar = apseVar;
            if (this.event_ != apse.a) {
                aozy createBuilder = apse.a.createBuilder((apse) this.event_);
                createBuilder.w(apseVar);
                aoyjVar = createBuilder.t();
            }
        }
        this.event_ = aoyjVar;
        this.eventCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDatabaseOpenError(apsf apsfVar) {
        apsfVar.getClass();
        aoyj aoyjVar = apsfVar;
        if (this.eventCase_ == 3) {
            aoyjVar = apsfVar;
            if (this.event_ != apsf.a) {
                aozy createBuilder = apsf.a.createBuilder((apsf) this.event_);
                createBuilder.w(apsfVar);
                aoyjVar = createBuilder.t();
            }
        }
        this.event_ = aoyjVar;
        this.eventCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDecryptionSuccessful(apsg apsgVar) {
        apsgVar.getClass();
        aoyj aoyjVar = apsgVar;
        if (this.eventCase_ == 7) {
            aoyjVar = apsgVar;
            if (this.event_ != apsg.a) {
                aozy createBuilder = apsg.a.createBuilder((apsg) this.event_);
                createBuilder.w(apsgVar);
                aoyjVar = createBuilder.t();
            }
        }
        this.event_ = aoyjVar;
        this.eventCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEncryptionSuccessful(apsh apshVar) {
        apshVar.getClass();
        aoyj aoyjVar = apshVar;
        if (this.eventCase_ == 9) {
            aoyjVar = apshVar;
            if (this.event_ != apsh.a) {
                aozy createBuilder = apsh.a.createBuilder((apsh) this.event_);
                createBuilder.w(apshVar);
                aoyjVar = createBuilder.t();
            }
        }
        this.event_ = aoyjVar;
        this.eventCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFailedToDecrypt(apsi apsiVar) {
        apsiVar.getClass();
        aoyj aoyjVar = apsiVar;
        if (this.eventCase_ == 6) {
            aoyjVar = apsiVar;
            if (this.event_ != apsi.a) {
                aozy createBuilder = apsi.a.createBuilder((apsi) this.event_);
                createBuilder.w(apsiVar);
                aoyjVar = createBuilder.t();
            }
        }
        this.event_ = aoyjVar;
        this.eventCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFailedToEncrypt(apsj apsjVar) {
        apsjVar.getClass();
        aoyj aoyjVar = apsjVar;
        if (this.eventCase_ == 8) {
            aoyjVar = apsjVar;
            if (this.event_ != apsj.a) {
                aozy createBuilder = apsj.a.createBuilder((apsj) this.event_);
                createBuilder.w(apsjVar);
                aoyjVar = createBuilder.t();
            }
        }
        this.event_ = aoyjVar;
        this.eventCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFtdShouldNotBeSent(apsk apskVar) {
        apskVar.getClass();
        aoyj aoyjVar = apskVar;
        if (this.eventCase_ == 11) {
            aoyjVar = apskVar;
            if (this.event_ != apsk.a) {
                aozy createBuilder = apsk.a.createBuilder((apsk) this.event_);
                createBuilder.w(apskVar);
                aoyjVar = createBuilder.t();
            }
        }
        this.event_ = aoyjVar;
        this.eventCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeKeyTransparencyEvent(apsl apslVar) {
        apslVar.getClass();
        aoyj aoyjVar = apslVar;
        if (this.eventCase_ == 12) {
            aoyjVar = apslVar;
            if (this.event_ != apsl.a) {
                aozy createBuilder = apsl.a.createBuilder((apsl) this.event_);
                createBuilder.w(apslVar);
                aoyjVar = createBuilder.t();
            }
        }
        this.event_ = aoyjVar;
        this.eventCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePrekeyFetchComplete(apsm apsmVar) {
        apsmVar.getClass();
        aoyj aoyjVar = apsmVar;
        if (this.eventCase_ == 10) {
            aoyjVar = apsmVar;
            if (this.event_ != apsm.a) {
                aozy createBuilder = apsm.a.createBuilder((apsm) this.event_);
                createBuilder.w(apsmVar);
                aoyjVar = createBuilder.t();
            }
        }
        this.event_ = aoyjVar;
        this.eventCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSchemaMigrationEnd(apsn apsnVar) {
        apsnVar.getClass();
        aoyj aoyjVar = apsnVar;
        if (this.eventCase_ == 5) {
            aoyjVar = apsnVar;
            if (this.event_ != apsn.a) {
                aozy createBuilder = apsn.a.createBuilder((apsn) this.event_);
                createBuilder.w(apsnVar);
                aoyjVar = createBuilder.t();
            }
        }
        this.event_ = aoyjVar;
        this.eventCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSchemaMigrationStart(apso apsoVar) {
        apsoVar.getClass();
        aoyj aoyjVar = apsoVar;
        if (this.eventCase_ == 4) {
            aoyjVar = apsoVar;
            if (this.event_ != apso.a) {
                aozy createBuilder = apso.a.createBuilder((apso) this.event_);
                createBuilder.w(apsoVar);
                aoyjVar = createBuilder.t();
            }
        }
        this.event_ = aoyjVar;
        this.eventCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSetDeviceIdEvent(apsr apsrVar) {
        apsrVar.getClass();
        aoyj aoyjVar = apsrVar;
        if (this.eventCase_ == 13) {
            aoyjVar = apsrVar;
            if (this.event_ != apsr.a) {
                aozy createBuilder = apsr.a.createBuilder((apsr) this.event_);
                createBuilder.w(apsrVar);
                aoyjVar = createBuilder.t();
            }
        }
        this.event_ = aoyjVar;
        this.eventCase_ = 13;
    }

    public static apsp newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ScytaleLoggingProto$ScytaleEvent parseDelimitedFrom(InputStream inputStream) {
        return (ScytaleLoggingProto$ScytaleEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(aozb aozbVar) {
        return (ScytaleLoggingProto$ScytaleEvent) apag.parseFrom(DEFAULT_INSTANCE, aozbVar);
    }

    public static apca<ScytaleLoggingProto$ScytaleEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApiResult(apse apseVar) {
        apseVar.getClass();
        this.event_ = apseVar;
        this.eventCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDatabaseOpenError(apsf apsfVar) {
        apsfVar.getClass();
        this.event_ = apsfVar;
        this.eventCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDecryptionSuccessful(apsg apsgVar) {
        apsgVar.getClass();
        this.event_ = apsgVar;
        this.eventCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncryptionSuccessful(apsh apshVar) {
        apshVar.getClass();
        this.event_ = apshVar;
        this.eventCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailedToDecrypt(apsi apsiVar) {
        apsiVar.getClass();
        this.event_ = apsiVar;
        this.eventCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailedToEncrypt(apsj apsjVar) {
        apsjVar.getClass();
        this.event_ = apsjVar;
        this.eventCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFtdShouldNotBeSent(apsk apskVar) {
        apskVar.getClass();
        this.event_ = apskVar;
        this.eventCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyTransparencyEvent(apsl apslVar) {
        apslVar.getClass();
        this.event_ = apslVar;
        this.eventCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrekeyFetchComplete(apsm apsmVar) {
        apsmVar.getClass();
        this.event_ = apsmVar;
        this.eventCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchemaMigrationEnd(apsn apsnVar) {
        apsnVar.getClass();
        this.event_ = apsnVar;
        this.eventCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchemaMigrationStart(apso apsoVar) {
        apsoVar.getClass();
        this.event_ = apsoVar;
        this.eventCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSetDeviceIdEvent(apsr apsrVar) {
        apsrVar.getClass();
        this.event_ = apsrVar;
        this.eventCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceId(String str) {
        str.getClass();
        this.traceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceIdBytes(aozb aozbVar) {
        checkByteStringIsUtf8(aozbVar);
        this.traceId_ = aozbVar.D();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0004\r\u0001\u0000\u0001\r\r\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000", new Object[]{"event_", "eventCase_", "traceId_", apse.class, apsf.class, apso.class, apsn.class, apsi.class, apsg.class, apsj.class, apsh.class, apsm.class, apsk.class, apsl.class, apsr.class});
            case 3:
                return new ScytaleLoggingProto$ScytaleEvent();
            case 4:
                return new apsp();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                apca<ScytaleLoggingProto$ScytaleEvent> apcaVar = PARSER;
                if (apcaVar == null) {
                    synchronized (ScytaleLoggingProto$ScytaleEvent.class) {
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

    public apse getApiResult() {
        if (this.eventCase_ == 2) {
            return (apse) this.event_;
        }
        return apse.a;
    }

    public apsf getDatabaseOpenError() {
        if (this.eventCase_ == 3) {
            return (apsf) this.event_;
        }
        return apsf.a;
    }

    public apsg getDecryptionSuccessful() {
        if (this.eventCase_ == 7) {
            return (apsg) this.event_;
        }
        return apsg.a;
    }

    public apsh getEncryptionSuccessful() {
        if (this.eventCase_ == 9) {
            return (apsh) this.event_;
        }
        return apsh.a;
    }

    public apsq getEventCase() {
        int i = this.eventCase_;
        if (i != 0) {
            switch (i) {
                case 2:
                    return apsq.API_RESULT;
                case 3:
                    return apsq.DATABASE_OPEN_ERROR;
                case 4:
                    return apsq.SCHEMA_MIGRATION_START;
                case 5:
                    return apsq.SCHEMA_MIGRATION_END;
                case 6:
                    return apsq.FAILED_TO_DECRYPT;
                case 7:
                    return apsq.DECRYPTION_SUCCESSFUL;
                case 8:
                    return apsq.FAILED_TO_ENCRYPT;
                case 9:
                    return apsq.ENCRYPTION_SUCCESSFUL;
                case 10:
                    return apsq.PREKEY_FETCH_COMPLETE;
                case 11:
                    return apsq.FTD_SHOULD_NOT_BE_SENT;
                case 12:
                    return apsq.KEY_TRANSPARENCY_EVENT;
                case 13:
                    return apsq.SET_DEVICE_ID_EVENT;
                default:
                    return null;
            }
        }
        return apsq.EVENT_NOT_SET;
    }

    public apsi getFailedToDecrypt() {
        if (this.eventCase_ == 6) {
            return (apsi) this.event_;
        }
        return apsi.a;
    }

    public apsj getFailedToEncrypt() {
        if (this.eventCase_ == 8) {
            return (apsj) this.event_;
        }
        return apsj.a;
    }

    public apsk getFtdShouldNotBeSent() {
        if (this.eventCase_ == 11) {
            return (apsk) this.event_;
        }
        return apsk.a;
    }

    public apsl getKeyTransparencyEvent() {
        if (this.eventCase_ == 12) {
            return (apsl) this.event_;
        }
        return apsl.a;
    }

    public apsm getPrekeyFetchComplete() {
        if (this.eventCase_ == 10) {
            return (apsm) this.event_;
        }
        return apsm.a;
    }

    public apsn getSchemaMigrationEnd() {
        if (this.eventCase_ == 5) {
            return (apsn) this.event_;
        }
        return apsn.a;
    }

    public apso getSchemaMigrationStart() {
        if (this.eventCase_ == 4) {
            return (apso) this.event_;
        }
        return apso.a;
    }

    public apsr getSetDeviceIdEvent() {
        if (this.eventCase_ == 13) {
            return (apsr) this.event_;
        }
        return apsr.a;
    }

    public String getTraceId() {
        return this.traceId_;
    }

    public aozb getTraceIdBytes() {
        return aozb.z(this.traceId_);
    }

    public boolean hasApiResult() {
        if (this.eventCase_ == 2) {
            return true;
        }
        return false;
    }

    public boolean hasDatabaseOpenError() {
        if (this.eventCase_ == 3) {
            return true;
        }
        return false;
    }

    public boolean hasDecryptionSuccessful() {
        if (this.eventCase_ == 7) {
            return true;
        }
        return false;
    }

    public boolean hasEncryptionSuccessful() {
        if (this.eventCase_ == 9) {
            return true;
        }
        return false;
    }

    public boolean hasFailedToDecrypt() {
        if (this.eventCase_ == 6) {
            return true;
        }
        return false;
    }

    public boolean hasFailedToEncrypt() {
        if (this.eventCase_ == 8) {
            return true;
        }
        return false;
    }

    public boolean hasFtdShouldNotBeSent() {
        if (this.eventCase_ == 11) {
            return true;
        }
        return false;
    }

    public boolean hasKeyTransparencyEvent() {
        if (this.eventCase_ == 12) {
            return true;
        }
        return false;
    }

    public boolean hasPrekeyFetchComplete() {
        if (this.eventCase_ == 10) {
            return true;
        }
        return false;
    }

    public boolean hasSchemaMigrationEnd() {
        if (this.eventCase_ == 5) {
            return true;
        }
        return false;
    }

    public boolean hasSchemaMigrationStart() {
        if (this.eventCase_ == 4) {
            return true;
        }
        return false;
    }

    public boolean hasSetDeviceIdEvent() {
        if (this.eventCase_ == 13) {
            return true;
        }
        return false;
    }

    public static apsp newBuilder(ScytaleLoggingProto$ScytaleEvent scytaleLoggingProto$ScytaleEvent) {
        return DEFAULT_INSTANCE.createBuilder(scytaleLoggingProto$ScytaleEvent);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseDelimitedFrom(InputStream inputStream, aozs aozsVar) {
        return (ScytaleLoggingProto$ScytaleEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, aozsVar);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(aozb aozbVar, aozs aozsVar) {
        return (ScytaleLoggingProto$ScytaleEvent) apag.parseFrom(DEFAULT_INSTANCE, aozbVar, aozsVar);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(aozg aozgVar) {
        return (ScytaleLoggingProto$ScytaleEvent) apag.parseFrom(DEFAULT_INSTANCE, aozgVar);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(aozg aozgVar, aozs aozsVar) {
        return (ScytaleLoggingProto$ScytaleEvent) apag.parseFrom(DEFAULT_INSTANCE, aozgVar, aozsVar);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(InputStream inputStream) {
        return (ScytaleLoggingProto$ScytaleEvent) apag.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(InputStream inputStream, aozs aozsVar) {
        return (ScytaleLoggingProto$ScytaleEvent) apag.parseFrom(DEFAULT_INSTANCE, inputStream, aozsVar);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(ByteBuffer byteBuffer) {
        return (ScytaleLoggingProto$ScytaleEvent) apag.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(ByteBuffer byteBuffer, aozs aozsVar) {
        return (ScytaleLoggingProto$ScytaleEvent) apag.parseFrom(DEFAULT_INSTANCE, byteBuffer, aozsVar);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(byte[] bArr) {
        return (ScytaleLoggingProto$ScytaleEvent) apag.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(byte[] bArr, aozs aozsVar) {
        return (ScytaleLoggingProto$ScytaleEvent) apag.parseFrom(DEFAULT_INSTANCE, bArr, aozsVar);
    }
}
