package com.google.communication.synapse.security.scytale;

import defpackage.anif;
import defpackage.aozb;
import defpackage.aozg;
import defpackage.aozs;
import defpackage.aozz;
import defpackage.apaf;
import defpackage.apag;
import defpackage.apbu;
import defpackage.apca;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig extends apag<ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig, anif> implements apbu {
    private static final ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig DEFAULT_INSTANCE;
    private static volatile apca<ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig> PARSER = null;
    public static final int RUN_PER_TABLE_SCHEMA_VALIDATION_FIELD_NUMBER = 2;
    public static final int RUN_SQLITE_MASTER_SCHEMA_VALIDATION_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean runPerTableSchemaValidation_;
    private boolean runSqliteMasterSchemaValidation_;

    static {
        ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig scytaleExperimentConfigOuterClass$ScytaleExperimentConfig = new ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig();
        DEFAULT_INSTANCE = scytaleExperimentConfigOuterClass$ScytaleExperimentConfig;
        apag.registerDefaultInstance(ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig.class, scytaleExperimentConfigOuterClass$ScytaleExperimentConfig);
    }

    private ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRunPerTableSchemaValidation() {
        this.bitField0_ &= -3;
        this.runPerTableSchemaValidation_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRunSqliteMasterSchemaValidation() {
        this.bitField0_ &= -2;
        this.runSqliteMasterSchemaValidation_ = false;
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static anif newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseDelimitedFrom(InputStream inputStream) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(aozb aozbVar) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) apag.parseFrom(DEFAULT_INSTANCE, aozbVar);
    }

    public static apca<ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRunPerTableSchemaValidation(boolean z) {
        this.bitField0_ |= 2;
        this.runPerTableSchemaValidation_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRunSqliteMasterSchemaValidation(boolean z) {
        this.bitField0_ |= 1;
        this.runSqliteMasterSchemaValidation_ = z;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "runSqliteMasterSchemaValidation_", "runPerTableSchemaValidation_"});
            case NEW_MUTABLE_INSTANCE:
                return new ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig();
            case NEW_BUILDER:
                return new anif();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                apca<ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig> apcaVar = PARSER;
                if (apcaVar == null) {
                    synchronized (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig.class) {
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

    public boolean getRunPerTableSchemaValidation() {
        return this.runPerTableSchemaValidation_;
    }

    public boolean getRunSqliteMasterSchemaValidation() {
        return this.runSqliteMasterSchemaValidation_;
    }

    public boolean hasRunPerTableSchemaValidation() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasRunSqliteMasterSchemaValidation() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public static anif newBuilder(ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig scytaleExperimentConfigOuterClass$ScytaleExperimentConfig) {
        return DEFAULT_INSTANCE.createBuilder(scytaleExperimentConfigOuterClass$ScytaleExperimentConfig);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseDelimitedFrom(InputStream inputStream, aozs aozsVar) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, aozsVar);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(aozb aozbVar, aozs aozsVar) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) apag.parseFrom(DEFAULT_INSTANCE, aozbVar, aozsVar);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(aozg aozgVar) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) apag.parseFrom(DEFAULT_INSTANCE, aozgVar);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(aozg aozgVar, aozs aozsVar) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) apag.parseFrom(DEFAULT_INSTANCE, aozgVar, aozsVar);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(InputStream inputStream) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) apag.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(InputStream inputStream, aozs aozsVar) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) apag.parseFrom(DEFAULT_INSTANCE, inputStream, aozsVar);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(ByteBuffer byteBuffer) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) apag.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(ByteBuffer byteBuffer, aozs aozsVar) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) apag.parseFrom(DEFAULT_INSTANCE, byteBuffer, aozsVar);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(byte[] bArr) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) apag.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(byte[] bArr, aozs aozsVar) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) apag.parseFrom(DEFAULT_INSTANCE, bArr, aozsVar);
    }
}
