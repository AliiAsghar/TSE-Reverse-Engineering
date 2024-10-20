package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fwk implements err {
    final /* synthetic */ fwm a;
    private final fvc b;

    public fwk(fwm fwmVar, fvc fvcVar) {
        this.a = fwmVar;
        this.b = fvcVar;
    }

    @Override // defpackage.err
    public final void eD(ern ernVar) {
        String str;
        int i = ernVar.a;
        alnr alnrVar = fwo.a;
        if (i != 7000) {
            if (i != 7001) {
                switch (i) {
                    case 1000:
                        str = "ERROR_CODE_UNSPECIFIED";
                        break;
                    case 1001:
                        str = "ERROR_CODE_REMOTE_ERROR";
                        break;
                    case 1002:
                        str = "ERROR_CODE_BEHIND_LIVE_WINDOW";
                        break;
                    case 1003:
                        str = "ERROR_CODE_TIMEOUT";
                        break;
                    case 1004:
                        str = "ERROR_CODE_FAILED_RUNTIME_CHECK";
                        break;
                    default:
                        switch (i) {
                            case 2000:
                                str = "ERROR_CODE_IO_UNSPECIFIED";
                                break;
                            case 2001:
                                str = "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                                break;
                            case 2002:
                                str = "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                                break;
                            case 2003:
                                str = "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                                break;
                            case 2004:
                                str = "ERROR_CODE_IO_BAD_HTTP_STATUS";
                                break;
                            case 2005:
                                str = "ERROR_CODE_IO_FILE_NOT_FOUND";
                                break;
                            case 2006:
                                str = "ERROR_CODE_IO_NO_PERMISSION";
                                break;
                            case 2007:
                                str = "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                                break;
                            case 2008:
                                str = "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                                break;
                            default:
                                switch (i) {
                                    case 3001:
                                        str = "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                        break;
                                    case 3002:
                                        str = "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                        break;
                                    case 3003:
                                        str = "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                        break;
                                    case 3004:
                                        str = "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                        break;
                                    default:
                                        switch (i) {
                                            case 4001:
                                                str = "ERROR_CODE_DECODER_INIT_FAILED";
                                                break;
                                            case 4002:
                                                str = "ERROR_CODE_DECODER_QUERY_FAILED";
                                                break;
                                            case 4003:
                                                str = "ERROR_CODE_DECODING_FAILED";
                                                break;
                                            case 4004:
                                                str = "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                                break;
                                            case 4005:
                                                str = "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                                break;
                                            case 4006:
                                                str = "ERROR_CODE_DECODING_RESOURCES_RECLAIMED";
                                                break;
                                            default:
                                                switch (i) {
                                                    case 5001:
                                                        str = "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
                                                        break;
                                                    case 5002:
                                                        str = "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
                                                        break;
                                                    case 5003:
                                                        str = "ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED";
                                                        break;
                                                    case 5004:
                                                        str = "ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED";
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 6000:
                                                                str = "ERROR_CODE_DRM_UNSPECIFIED";
                                                                break;
                                                            case 6001:
                                                                str = "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                                break;
                                                            case 6002:
                                                                str = "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                                break;
                                                            case 6003:
                                                                str = "ERROR_CODE_DRM_CONTENT_ERROR";
                                                                break;
                                                            case 6004:
                                                                str = "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                                break;
                                                            case 6005:
                                                                str = "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                                break;
                                                            case 6006:
                                                                str = "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                                break;
                                                            case 6007:
                                                                str = "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                                break;
                                                            case 6008:
                                                                str = "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                                break;
                                                            default:
                                                                str = "invalid error code";
                                                                break;
                                                        }
                                                }
                                        }
                                }
                        }
                }
            } else {
                str = "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
            }
        } else {
            str = "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
        }
        Integer num = (Integer) alnrVar.getOrDefault(str, 1000);
        dzg.g(num);
        this.b.b(new fwo("Asset loader error", ernVar, num.intValue()));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [int, boolean] */
    @Override // defpackage.err
    public final void eG(esg esgVar) {
        try {
            ?? b = esgVar.b(1);
            int i = b;
            if (esgVar.b(2)) {
                i = b + 1;
            }
            if (i > 0) {
                this.b.c(i);
                this.a.a.e();
            } else {
                this.b.b(new fwo("Asset loader error", new IllegalStateException("The asset loader has no track to output."), 1001));
            }
        } catch (RuntimeException e) {
            this.b.b(new fwo("Asset loader error", e, 1000));
        }
    }

    @Override // defpackage.err
    public final void y(erz erzVar) {
        int i;
        try {
            if (this.a.b == 1) {
                ery eryVar = new ery();
                erzVar.p(0, eryVar);
                if (!eryVar.k) {
                    long j = eryVar.m;
                    fwm fwmVar = this.a;
                    if (j > 0) {
                        i = 2;
                    } else {
                        i = 3;
                    }
                    fwmVar.b = i;
                    this.b.a(j);
                }
            }
        } catch (RuntimeException e) {
            this.b.b(new fwo("Asset loader error", e, 1000));
        }
    }

    @Override // defpackage.err
    public final /* synthetic */ void eF() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void eJ() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void m() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void o() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void p() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void q() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void r() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void s() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void u() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void v() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void w() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void x() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void z() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void a(eta etaVar) {
    }

    @Override // defpackage.err
    public final /* synthetic */ void eB(boolean z) {
    }

    @Override // defpackage.err
    public final /* synthetic */ void eC(int i) {
    }

    @Override // defpackage.err
    public final /* synthetic */ void eE(ern ernVar) {
    }

    @Override // defpackage.err
    public final /* synthetic */ void eH(esn esnVar) {
    }

    @Override // defpackage.err
    public final /* synthetic */ void eI(erq erqVar) {
    }

    @Override // defpackage.err
    public final /* synthetic */ void t(int i) {
    }
}
