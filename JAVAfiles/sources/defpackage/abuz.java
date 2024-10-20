package defpackage;

import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FieldMappingDictionary;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.constellation.GetIidTokenRequest;
import com.google.android.gms.constellation.GetIidTokenResponse;
import com.google.android.gms.constellation.IdTokenRequest;
import com.google.android.gms.constellation.ImsiRequest;
import com.google.android.gms.constellation.PhoneNumberInfo;
import com.google.android.gms.constellation.PhoneNumberVerification;
import com.google.android.gms.constellation.VerifyPhoneNumberRequest;
import com.google.android.gms.constellation.VerifyPhoneNumberResponse;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import com.google.android.gms.droidguard.internal.DroidGuardInitReply;
import com.google.android.gms.duokit.DuoId;
import com.google.android.gms.duokit.GenerateInviteLinkRequest;
import com.google.android.gms.duokit.GenerateInviteLinkResponse;
import com.google.android.gms.duokit.GetApiAvailabilityResponse;
import com.google.android.gms.duokit.LookupSingleRemoteReachabilityRequest;
import com.google.android.gms.duokit.LookupSingleRemoteReachabilityResponse;
import com.google.android.gms.duokit.RemoteUserReachability;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abuz implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public abuz(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 491
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r23) {
        /*
            Method dump skipped, instructions count: 1334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abuz.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new FastJsonResponse.Field[i];
            case 1:
                return new FieldMappingDictionary[i];
            case 2:
                return new FieldMappingDictionary.Entry[i];
            case 3:
                return new SafeParcelResponse[i];
            case 4:
                return new GetIidTokenRequest[i];
            case 5:
                return new GetIidTokenResponse[i];
            case 6:
                return new IdTokenRequest[i];
            case 7:
                return new ImsiRequest[i];
            case 8:
                return new PhoneNumberInfo[i];
            case 9:
                return new PhoneNumberVerification[i];
            case 10:
                return new VerifyPhoneNumberRequest[i];
            case 11:
                return new VerifyPhoneNumberResponse[i];
            case 12:
                return new DroidGuardResultsRequest[i];
            case 13:
                return new DroidGuardInitReply[i];
            case 14:
                return new DuoId[i];
            case 15:
                return new GenerateInviteLinkRequest[i];
            case 16:
                return new GenerateInviteLinkResponse[i];
            case 17:
                return new GetApiAvailabilityResponse[i];
            case 18:
                return new LookupSingleRemoteReachabilityRequest[i];
            case 19:
                return new LookupSingleRemoteReachabilityResponse[i];
            default:
                return new RemoteUserReachability[i];
        }
    }
}
