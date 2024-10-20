package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aphl implements apam {
    private final /* synthetic */ int v;
    public static final apam u = new aphl(20);
    public static final apam t = new aphl(19);
    public static final apam s = new aphl(18);
    public static final apam r = new aphl(17);
    public static final apam q = new aphl(16);
    public static final apam p = new aphl(15);
    public static final apam o = new aphl(14);
    public static final apam n = new aphl(13);
    public static final apam m = new aphl(12);
    public static final apam l = new aphl(11);
    public static final apam k = new aphl(10);
    public static final apam j = new aphl(9);
    public static final apam i = new aphl(8);
    public static final apam h = new aphl(7);
    public static final apam g = new aphl(6);
    public static final apam f = new aphl(5);
    public static final apam e = new aphl(4);
    public static final apam d = new aphl(3);
    static final apam c = new aphl(2);
    static final apam b = new aphl(1);
    static final apam a = new aphl(0);

    private aphl(int i2) {
        this.v = i2;
    }

    @Override // defpackage.apam
    public final boolean a(int i2) {
        apak apakVar = null;
        switch (this.v) {
            case 0:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    apakVar = aphm.CPM_LARGE_MESSAGE_MODE_SERVICE;
                                }
                            } else {
                                apakVar = aphm.CPM_PAGER_MODE_SERVICE;
                            }
                        } else {
                            apakVar = aphm.CPM_SESSION_SERVICE;
                        }
                    } else {
                        apakVar = aphm.UNEXPECTED_SERVICE;
                    }
                } else {
                    apakVar = aphm.UNKNOWN_SERVICE;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 1:
                switch (i2) {
                    case 0:
                        apakVar = aphk.UNKNOWN_CAPABILITY;
                        break;
                    case 1:
                        apakVar = aphk.RCSE_FILETRANSFER_CAPABILITY;
                        break;
                    case 2:
                        apakVar = aphk.RCSE_IMAGE_SHARE_CAPABILITY;
                        break;
                    case 3:
                        apakVar = aphk.RCSE_VIDEO_SHARE_CAPABILITY;
                        break;
                    case 4:
                        apakVar = aphk.RCSE_SOCIAL_PRESENCE_CAPABILITY;
                        break;
                    case 5:
                        apakVar = aphk.RCSE_CAPABILITY_PRESENCE_CAPABILITY;
                        break;
                    case 6:
                        apakVar = aphk.MMTEL_VOICECALLING_CAPABILITY;
                        break;
                    case 7:
                        apakVar = aphk.VIDEO_CAPABILITY;
                        break;
                    case 8:
                        apakVar = aphk.RCS_IPCALLING_CAPABILITY;
                        break;
                    case 9:
                        apakVar = aphk.RCS_VIDEOCALLINGONLY_CAPABILITY;
                        break;
                    case 10:
                        apakVar = aphk.RCS_FILETRANSFER_THUMBNAIL_CAPABILITY;
                        break;
                    case 11:
                        apakVar = aphk.RCS_LOCATION_PUSH_CAPABILITY;
                        break;
                    case 12:
                        apakVar = aphk.RCS_LOCATION_PULL_CAPABILITY;
                        break;
                    case 13:
                        apakVar = aphk.RCS_LOCATION_PULL_FT_CAPABILITY;
                        break;
                    case 14:
                        apakVar = aphk.BLACKBIRD_FULLY_INTEGRATED_MESSAGING_CAPABILITY;
                        break;
                    case 15:
                        apakVar = aphk.JIBE_STICKERS_CAPABILITY;
                        break;
                    case 16:
                        apakVar = aphk.RCS_POST_CALL_CAPABILITY;
                        break;
                    case 17:
                        apakVar = aphk.RCS_SHARED_MAP_CAPABILITY;
                        break;
                    case 18:
                        apakVar = aphk.RCS_SHARED_SKETCH_CAPABILITY;
                        break;
                    case 19:
                        apakVar = aphk.RCS_MESSAGE_REVOKE_CAPABILITY;
                        break;
                    case 20:
                        apakVar = aphk.RCS_FILE_TRANSFER_VIA_SMS_CAPABILITY;
                        break;
                    case 21:
                        apakVar = aphk.RCS_FILE_TRANSFER_VIA_HTTP_CAPABILITY;
                        break;
                    case 22:
                        apakVar = aphk.RCS_FILE_TRANSFER_VIA_MSRP_CAPABILITY;
                        break;
                    case 23:
                        apakVar = aphk.RCS_LOCATION_VIA_SMS_CAPABILITY;
                        break;
                    case 24:
                        apakVar = aphk.RCS_GROUP_CHAT_CAPABILITY;
                        break;
                    case 25:
                        apakVar = aphk.RCS_RBM_CAPABILITY;
                        break;
                    case 26:
                        apakVar = aphk.RCS_RBM_BOT_CAPABILITY;
                        break;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 2:
                return a.aW(i2);
            case 3:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    apakVar = aphx.AUTHENTICATION_TYPE_GBA;
                                }
                            } else {
                                apakVar = aphx.AUTHENTICATION_TYPE_DIGEST;
                            }
                        } else {
                            apakVar = aphx.AUTHENTICATION_TYPE_BASIC;
                        }
                    } else {
                        apakVar = aphx.AUTHENTICATION_TYPE_NONE;
                    }
                } else {
                    apakVar = aphx.AUTHENTICATION_TYPE_UNKNOWN;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 4:
                return a.bb(i2);
            case 5:
                switch (i2) {
                    case 0:
                        apakVar = aphy.FILE_TRANSFER_FAILURE_REASON_UNKNOWN;
                        break;
                    case 1:
                        apakVar = aphy.FILE_TRANSFER_FAILURE_REASON_FILE_TRANSFER_CANCELLED;
                        break;
                    case 2:
                        apakVar = aphy.FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED;
                        break;
                    case 3:
                        apakVar = aphy.FILE_TRANSFER_FAILURE_REASON_EMPTY_HTTP_RESPONSE_BODY;
                        break;
                    case 4:
                        apakVar = aphy.FILE_TRANSFER_FAILURE_REASON_UNEXPECTED_HTTP_RESPONSE_CODE;
                        break;
                    case 5:
                        apakVar = aphy.FILE_TRANSFER_FAILURE_REASON_MAX_RETRIES_REACHED;
                        break;
                    case 6:
                        apakVar = aphy.FILE_TRANSFER_FAILURE_REASON_SESSION_ERROR;
                        break;
                    case 7:
                        apakVar = aphy.FILE_TRANSFER_FAILURE_REASON_WRITING_TO_FILE_FAILED;
                        break;
                    case 8:
                        apakVar = aphy.FILE_TRANSFER_FAILURE_REASON_INVALID_RETRY_AFTER_VALUE;
                        break;
                    case 9:
                        apakVar = aphy.FILE_TRANSFER_FAILURE_REASON_INVALID_RESPONSE_DATA_SIZE;
                        break;
                    case 10:
                        apakVar = aphy.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_DELETE_A_FILE;
                        break;
                    case 11:
                        apakVar = aphy.FILE_TRANSFER_FAILURE_REASON_GBA_AUTH_FAILURE;
                        break;
                    case 12:
                        apakVar = aphy.FILE_TRANSFER_FAILURE_REASON_GBA_UNEXPECTED_EXCEPTION;
                        break;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 6:
                return a.bb(i2);
            case 7:
                return a.aW(i2);
            case 8:
                return a.aW(i2);
            case 9:
                return a.bc(i2);
            case 10:
                return a.bf(i2);
            case 11:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 == 5) {
                                        apakVar = apin.DNS_CLIENT_EXCEPTION_TYPE_RUNTIME;
                                    }
                                } else {
                                    apakVar = apin.DNS_CLIENT_EXCEPTION_TYPE_NO_CLASS_DEF_FOUND_ERROR;
                                }
                            } else {
                                apakVar = apin.DNS_CLIENT_EXCEPTION_TYPE_EXCEPTION_IN_INITIALIZATION_ERROR;
                            }
                        } else {
                            apakVar = apin.DNS_CLIENT_EXCEPTION_TYPE_TEXT_PARSE;
                        }
                    } else {
                        apakVar = apin.DNS_CLIENT_EXCEPTION_TYPE_CLASS_CAST;
                    }
                } else {
                    apakVar = apin.DNS_CLIENT_EXCEPTION_TYPE_UNKNOWN;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 12:
                return a.aW(i2);
            case 13:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 == 5) {
                                        apakVar = apio.DNS_FAILURE_TYPE_CLIENT_EXCEPTION;
                                    }
                                } else {
                                    apakVar = apio.DNS_FAILURE_TYPE_TRANSIENT;
                                }
                            } else {
                                apakVar = apio.DNS_FAILURE_TYPE_QUERY_TYPE_NOT_FOUND;
                            }
                        } else {
                            apakVar = apio.DNS_FAILURE_TYPE_HOST_NOT_FOUND;
                        }
                    } else {
                        apakVar = apio.DNS_FAILURE_TYPE_GENERIC;
                    }
                } else {
                    apakVar = apio.DNS_FAILURE_TYPE_UNKNOWN;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 14:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 == 5) {
                                        apakVar = apip.DNS_QUERY_RESULT_FAILURE;
                                    }
                                } else {
                                    apakVar = apip.DEPRECATED_DNS_QUERY_RESULT_FAILURE_QUERY_TYPE_NOT_FOUND;
                                }
                            } else {
                                apakVar = apip.DEPRECATED_DNS_QUERY_RESULT_FAILURE_HOST_NOT_FOUND;
                            }
                        } else {
                            apakVar = apip.DEPRECATED_DNS_QUERY_RESULT_FAILURE_GENERIC;
                        }
                    } else {
                        apakVar = apip.DNS_QUERY_RESULT_SUCCESS;
                    }
                } else {
                    apakVar = apip.DNS_QUERY_RESULT_UNKNOWN;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 15:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    apakVar = apiq.DNS_QUERY_TYPE_AAAA;
                                }
                            } else {
                                apakVar = apiq.DNS_QUERY_TYPE_A;
                            }
                        } else {
                            apakVar = apiq.DNS_QUERY_TYPE_SRV;
                        }
                    } else {
                        apakVar = apiq.DNS_QUERY_TYPE_NAPTR;
                    }
                } else {
                    apakVar = apiq.DNS_QUERY_TYPE_UNKNOWN;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 16:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            apakVar = apit.NETWORK_INTERFACE_AVAILABILITY_UNAVAILABLE;
                        }
                    } else {
                        apakVar = apit.NETWORK_INTERFACE_AVAILABILITY_AVAILABLE;
                    }
                } else {
                    apakVar = apit.NETWORK_INTERFACE_AVAILABILITY_UNKNOWN;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 17:
                return a.aW(i2);
            case 18:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                apakVar = apiu.NETWORK_INTERFACE_TYPE_VPN;
                            }
                        } else {
                            apakVar = apiu.NETWORK_INTERFACE_TYPE_WIFI;
                        }
                    } else {
                        apakVar = apiu.NETWORK_INTERFACE_TYPE_MOBILE_DATA;
                    }
                } else {
                    apakVar = apiu.NETWORK_INTERFACE_TYPE_UNKNOWN;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 19:
                switch (i2) {
                    case 0:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_UNKNOWN;
                        break;
                    case 1:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_SEND_SIP_MESSAGE;
                        break;
                    case 2:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_RECEIVE_SIP_RESPONSE;
                        break;
                    case 3:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_SIP_REQUEST_TIMEOUT;
                        break;
                    case 4:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_CONNECTIVITY_EVENT;
                        break;
                    case 5:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_TRANSPORT_ERROR;
                        break;
                    case 6:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_START_REGISTRATION;
                        break;
                    case 7:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_STOP_REGISTRATION;
                        break;
                    case 8:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_DISCOVER_SIP_SERVER;
                        break;
                    case 9:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_CONNECT_TO_SERVER;
                        break;
                    case 10:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_CONNECTED_TO_SERVER;
                        break;
                    case 11:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_REFRESH_TIMEOUT;
                        break;
                    case 12:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_RETRY_TIMEOUT;
                        break;
                    case 13:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_REREGISTRATION_REQUIRED;
                        break;
                    case 14:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_SIM_DETECTED;
                        break;
                    case 15:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_SIM_REMOVED;
                        break;
                    case 16:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_CONNECTION_CREATED;
                        break;
                    case 17:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_CONNECTION_DESTROYED;
                        break;
                    case 18:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_CONFIGURED;
                        break;
                    case 19:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_ACTIVATE;
                        break;
                    case 20:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_DEACTIVATE;
                        break;
                    case 21:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_REGISTRATION_FAILED;
                        break;
                    case 22:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_REGISTER_TIMEOUT;
                        break;
                    case 23:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_PUBLISH_TIMEOUT;
                        break;
                    case 24:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_PUBLISH_200OK_RESPONSE;
                        break;
                    case 25:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_PUBLISH_FAILED_RESPONSE;
                        break;
                    case 26:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_CONNECTION_TIMEOUT;
                        break;
                    case 27:
                        apakVar = apix.REGISTRATION_EVENT_MESSAGE_CONNECT_TO_SERVER_FAILURE;
                        break;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            default:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 == 5) {
                                        apakVar = apiy.SIP_REGISTRATION_EVENT_TYPE_REREGISTERING;
                                    }
                                } else {
                                    apakVar = apiy.SIP_REGISTRATION_EVENT_TYPE_UNREGISTERING;
                                }
                            } else {
                                apakVar = apiy.SIP_REGISTRATION_EVENT_TYPE_REGISTERING;
                            }
                        } else {
                            apakVar = apiy.SIP_REGISTRATION_EVENT_TYPE_UNREGISTERED;
                        }
                    } else {
                        apakVar = apiy.SIP_REGISTRATION_EVENT_TYPE_REGISTERED;
                    }
                } else {
                    apakVar = apiy.SIP_REGISTRATION_EVENT_TYPE_UNKNOWN;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
        }
    }
}
