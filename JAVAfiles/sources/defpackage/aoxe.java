package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoxe implements aojx {
    private final ahka b;
    private final alpt c;
    private final /* synthetic */ int d;

    public aoxe(int i, byte[] bArr) {
        this.d = i;
        this.b = ahka.a(aoxf.a, new ahka("SearchNearby"));
        this.c = alpt.s("https://www.googleapis.com/auth/maps-platform.places.nearbysearch", "https://www.googleapis.com/auth/maps-platform.places", "https://www.googleapis.com/auth/cloud-platform");
    }

    @Override // defpackage.aojx
    public final ahka a() {
        switch (this.d) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            case 2:
                return this.b;
            case 3:
                return this.b;
            case 4:
                return this.b;
            case 5:
                return this.b;
            case 6:
                return this.b;
            case 7:
                return this.b;
            case 8:
                return this.b;
            case 9:
                return this.b;
            case 10:
                return this.b;
            case 11:
                return this.b;
            case 12:
                return this.b;
            case 13:
                return this.b;
            case 14:
                return this.b;
            case 15:
                return this.b;
            case 16:
                return this.b;
            case 17:
                return this.b;
            case 18:
                return this.b;
            case 19:
                return this.b;
            default:
                return this.b;
        }
    }

    @Override // defpackage.aojx
    public final Set b() {
        switch (this.d) {
            case 0:
                if (this.c.isEmpty()) {
                    return aoxf.g.i;
                }
                return this.c;
            case 1:
                if (this.c.isEmpty()) {
                    return aoxf.g.i;
                }
                return this.c;
            case 2:
                if (this.c.isEmpty()) {
                    return aoxf.g.i;
                }
                return this.c;
            case 3:
                if (this.c.isEmpty()) {
                    return aoxf.g.i;
                }
                return this.c;
            case 4:
                if (this.c.isEmpty()) {
                    return aoxf.g.i;
                }
                return this.c;
            case 5:
                if (this.c.isEmpty()) {
                    return aqip.n.p;
                }
                return this.c;
            case 6:
                if (this.c.isEmpty()) {
                    return aqip.n.p;
                }
                return this.c;
            case 7:
                if (this.c.isEmpty()) {
                    return aqip.n.p;
                }
                return this.c;
            case 8:
                if (this.c.isEmpty()) {
                    return aqip.n.p;
                }
                return this.c;
            case 9:
                if (this.c.isEmpty()) {
                    return aqip.n.p;
                }
                return this.c;
            case 10:
                if (this.c.isEmpty()) {
                    return aqip.n.p;
                }
                return this.c;
            case 11:
                if (this.c.isEmpty()) {
                    return aqip.n.p;
                }
                return this.c;
            case 12:
                if (this.c.isEmpty()) {
                    return aqip.n.p;
                }
                return this.c;
            case 13:
                if (this.c.isEmpty()) {
                    return aqip.n.p;
                }
                return this.c;
            case 14:
                if (this.c.isEmpty()) {
                    return aqip.n.p;
                }
                return this.c;
            case 15:
                if (this.c.isEmpty()) {
                    return aqip.n.p;
                }
                return this.c;
            case 16:
                if (this.c.isEmpty()) {
                    return aqip.n.p;
                }
                return this.c;
            case 17:
                if (this.c.isEmpty()) {
                    return aqir.i.k;
                }
                return this.c;
            case 18:
                if (this.c.isEmpty()) {
                    return aqir.i.k;
                }
                return this.c;
            case 19:
                if (this.c.isEmpty()) {
                    return aqir.i.k;
                }
                return this.c;
            default:
                if (this.c.isEmpty()) {
                    return aqir.i.k;
                }
                return this.c;
        }
    }

    public final String toString() {
        switch (this.d) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            default:
                return this.b.a;
        }
    }

    public aoxe(int i) {
        this.d = i;
        this.b = ahka.a(aoxf.a, new ahka("SearchText"));
        this.c = alpt.s("https://www.googleapis.com/auth/maps-platform.places.textsearch", "https://www.googleapis.com/auth/maps-platform.places", "https://www.googleapis.com/auth/cloud-platform");
    }

    public aoxe(int i, char[] cArr) {
        this.d = i;
        this.b = ahka.a(aoxf.a, new ahka("GetPhotoMedia"));
        this.c = alpt.s("https://www.googleapis.com/auth/maps-platform.places.getphotomedia", "https://www.googleapis.com/auth/maps-platform.places", "https://www.googleapis.com/auth/cloud-platform");
    }

    public aoxe(int i, short[] sArr) {
        this.d = i;
        this.b = ahka.a(aoxf.a, new ahka("GetPlace"));
        this.c = alpt.s("https://www.googleapis.com/auth/maps-platform.places.details", "https://www.googleapis.com/auth/maps-platform.places", "https://www.googleapis.com/auth/cloud-platform");
    }

    public aoxe(int i, int[] iArr) {
        this.d = i;
        this.b = ahka.a(aoxf.a, new ahka("AutocompletePlaces"));
        this.c = alpt.s("https://www.googleapis.com/auth/maps-platform.places.autocomplete", "https://www.googleapis.com/auth/maps-platform.places", "https://www.googleapis.com/auth/cloud-platform");
    }

    public aoxe(int i, boolean[] zArr) {
        this.d = i;
        this.b = ahka.a(aqip.a, new ahka("JoinGroupViaLink"));
        this.c = alpt.r("https://www.googleapis.com/auth/tachyon", "https://www.googleapis.com/auth/android-messages");
    }

    public aoxe(int i, float[] fArr) {
        this.d = i;
        this.b = ahka.a(aqip.a, new ahka("GetGroupCountryCode"));
        this.c = alpt.r("https://www.googleapis.com/auth/tachyon", "https://www.googleapis.com/auth/android-messages");
    }

    public aoxe(int i, byte[][] bArr) {
        this.d = i;
        this.b = ahka.a(aqip.a, new ahka("DeleteGroup"));
        this.c = alpt.r("https://www.googleapis.com/auth/tachyon", "https://www.googleapis.com/auth/android-messages");
    }

    public aoxe(int i, char[][] cArr) {
        this.d = i;
        this.b = ahka.a(aqip.a, new ahka("CreateGroup"));
        this.c = alpt.r("https://www.googleapis.com/auth/tachyon", "https://www.googleapis.com/auth/android-messages");
    }

    public aoxe(int i, short[][] sArr) {
        this.d = i;
        this.b = ahka.a(aqip.a, new ahka("AddGroupUsers"));
        this.c = alpt.r("https://www.googleapis.com/auth/tachyon", "https://www.googleapis.com/auth/android-messages");
    }

    public aoxe(int i, int[][] iArr) {
        this.d = i;
        this.b = ahka.a(aqip.a, new ahka("KickGroupUsers"));
        this.c = alpt.r("https://www.googleapis.com/auth/tachyon", "https://www.googleapis.com/auth/android-messages");
    }

    public aoxe(int i, boolean[][] zArr) {
        this.d = i;
        this.b = ahka.a(aqip.a, new ahka("ChangeGroupProfile"));
        this.c = alpt.r("https://www.googleapis.com/auth/tachyon", "https://www.googleapis.com/auth/android-messages");
    }

    public aoxe(int i, float[][] fArr) {
        this.d = i;
        this.b = ahka.a(aqip.a, new ahka("ChangeGroupMemberRole"));
        this.c = alpt.r("https://www.googleapis.com/auth/tachyon", "https://www.googleapis.com/auth/android-messages");
    }

    public aoxe(int i, byte[][][] bArr) {
        this.d = i;
        this.b = ahka.a(aqip.a, new ahka("GetGroupIds"));
        this.c = alpt.r("https://www.googleapis.com/auth/tachyon", "https://www.googleapis.com/auth/android-messages");
    }

    public aoxe(int i, char[][][] cArr) {
        this.d = i;
        this.b = ahka.a(aqip.a, new ahka("GetGroupInfos"));
        this.c = alpt.r("https://www.googleapis.com/auth/tachyon", "https://www.googleapis.com/auth/android-messages");
    }

    public aoxe(int i, short[][][] sArr) {
        this.d = i;
        this.b = ahka.a(aqip.a, new ahka("GetGroupInfo"));
        this.c = alpt.r("https://www.googleapis.com/auth/tachyon", "https://www.googleapis.com/auth/android-messages");
    }

    public aoxe(int i, int[][][] iArr) {
        this.d = i;
        this.b = ahka.a(aqip.a, new ahka("GetGroupInviteLinkDetails"));
        this.c = alpt.r("https://www.googleapis.com/auth/tachyon", "https://www.googleapis.com/auth/android-messages");
    }

    public aoxe(int i, boolean[][][] zArr) {
        this.d = i;
        this.b = ahka.a(aqir.a, new ahka("BlockEntity"));
        this.c = alpt.r("https://www.googleapis.com/auth/tachyon", "https://www.googleapis.com/auth/android-messages");
    }

    public aoxe(int i, float[][][] fArr) {
        this.d = i;
        this.b = ahka.a(aqir.a, new ahka("UnblockEntity"));
        this.c = alpt.r("https://www.googleapis.com/auth/tachyon", "https://www.googleapis.com/auth/android-messages");
    }

    public aoxe(int i, byte[] bArr, byte[] bArr2) {
        this.d = i;
        this.b = ahka.a(aqir.a, new ahka("GetBlockedEntities"));
        this.c = alpt.r("https://www.googleapis.com/auth/tachyon", "https://www.googleapis.com/auth/android-messages");
    }

    public aoxe(int i, char[] cArr, byte[] bArr) {
        this.d = i;
        this.b = ahka.a(aqir.a, new ahka("TriggerSpamSignal"));
        this.c = alpt.r("https://www.googleapis.com/auth/tachyon", "https://www.googleapis.com/auth/android-messages");
    }
}
