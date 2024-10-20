package defpackage;

import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.FACLData;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import com.google.android.gms.auth.folsom.RecoveryRequest;
import com.google.android.gms.auth.folsom.RecoveryResult;
import com.google.android.gms.auth.folsom.SecurityDomainMember;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.auth.frp.FrpSnapshot;
import com.google.android.gms.auth.frp.FrpUnlockRequest;
import com.google.android.gms.auth.frp.FrpUnlockResponse;
import com.google.android.gms.auth.frp.PersistentDeviceOwnerState;
import com.google.android.gms.auth.frp.UnlockFactoryResetProtectionRequest;
import com.google.android.gms.auth.frp.UnlockFactoryResetProtectionResponse;
import com.google.android.gms.auth.frp.UnlockForWearRequest;
import com.google.android.gms.auth.frp.UnlockForWearResponse;
import com.google.android.gms.carrierauth.EAPAKARequest;
import com.google.android.gms.carrierauth.EAPAKAResponse;
import com.google.android.gms.carrierauth.EapInfoRequest;
import com.google.android.gms.carrierauth.EapInfoResponse;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmm implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public abmm(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 489
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r22) {
        /*
            Method dump skipped, instructions count: 1302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abmm.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new FACLData[i];
            case 1:
                return new FACLConfig[i];
            case 2:
                return new ManagedAuthOptions[i];
            case 3:
                return new PACLConfig[i];
            case 4:
                return new ScopeDetail[i];
            case 5:
                return new RecoveryRequest[i];
            case 6:
                return new RecoveryResult[i];
            case 7:
                return new SecurityDomainMember[i];
            case 8:
                return new SharedKey[i];
            case 9:
                return new FrpSnapshot[i];
            case 10:
                return new FrpUnlockRequest[i];
            case 11:
                return new FrpUnlockResponse[i];
            case 12:
                return new PersistentDeviceOwnerState[i];
            case 13:
                return new UnlockFactoryResetProtectionRequest[i];
            case 14:
                return new UnlockFactoryResetProtectionResponse[i];
            case 15:
                return new UnlockForWearRequest[i];
            case 16:
                return new UnlockForWearResponse[i];
            case 17:
                return new EAPAKARequest[i];
            case 18:
                return new EAPAKAResponse[i];
            case 19:
                return new EapInfoRequest[i];
            default:
                return new EapInfoResponse[i];
        }
    }
}
