package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmd {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final float i;
    public final int j;
    public final String k;
    public final euu l;

    private fmd(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8, String str, euu euuVar) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = f;
        this.j = i8;
        this.k = str;
        this.l = euuVar;
    }

    public static fmd a(euf eufVar) {
        return b(eufVar, false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0ad5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0ad8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b3 A[Catch: ArrayIndexOutOfBoundsException -> 0x0acf, TryCatch #3 {ArrayIndexOutOfBoundsException -> 0x0acf, blocks: (B:6:0x0015, B:25:0x0040, B:27:0x005f, B:29:0x006f, B:32:0x0087, B:45:0x00d4, B:52:0x0100, B:57:0x010a, B:61:0x0134, B:63:0x013a, B:65:0x0144, B:68:0x0149, B:70:0x014e, B:72:0x0156, B:74:0x0161, B:75:0x0164, B:77:0x016b, B:79:0x0170, B:86:0x01b3, B:88:0x01b9, B:91:0x01c0, B:94:0x01d9, B:98:0x01e5, B:100:0x01ed, B:102:0x01f3, B:105:0x01f9, B:107:0x01fe, B:108:0x01cf, B:109:0x01cc, B:111:0x0207, B:112:0x0180, B:117:0x0190, B:119:0x0196, B:120:0x01a0, B:122:0x01a7, B:123:0x01ab, B:126:0x0213, B:128:0x021f, B:132:0x0a75, B:133:0x022b, B:135:0x0241, B:137:0x0249, B:139:0x024b, B:143:0x0252, B:146:0x0259, B:147:0x0262, B:149:0x0266, B:151:0x0270, B:157:0x027a, B:159:0x0289, B:161:0x028c, B:162:0x028f, B:165:0x02b1, B:169:0x02c4, B:173:0x02fc, B:176:0x02e1, B:178:0x02bb, B:180:0x0303, B:182:0x030b, B:185:0x0316, B:189:0x031d, B:190:0x0326, B:192:0x0328, B:198:0x0330, B:200:0x033b, B:206:0x033e, B:204:0x0340, B:210:0x0343, B:214:0x034f, B:216:0x0354, B:218:0x035d, B:220:0x0362, B:222:0x036d, B:224:0x0375, B:226:0x037f, B:228:0x0383, B:232:0x0399, B:234:0x03a9, B:237:0x03b4, B:243:0x03c8, B:244:0x03d0, B:248:0x03f8, B:250:0x0407, B:258:0x0413, B:260:0x0419, B:263:0x041f, B:267:0x0423, B:265:0x0426, B:271:0x0429, B:273:0x042c, B:277:0x0435, B:279:0x043d, B:283:0x0448, B:285:0x044e, B:287:0x0450, B:292:0x0456, B:293:0x045e, B:297:0x046b, B:303:0x0489, B:305:0x048d, B:307:0x04a2, B:309:0x04af, B:313:0x04be, B:315:0x04c3, B:317:0x04c9, B:319:0x04cd, B:324:0x04d2, B:326:0x04e7, B:328:0x04ef, B:330:0x04fd, B:332:0x0508, B:333:0x0510, B:335:0x052e, B:337:0x0539, B:339:0x057e, B:346:0x055b, B:349:0x0566, B:364:0x0578, B:367:0x0589, B:372:0x05ac, B:374:0x05b0, B:376:0x05c4, B:378:0x05ca, B:382:0x05cf, B:384:0x05d6, B:387:0x05de, B:389:0x05e2, B:391:0x05e8, B:395:0x05ef, B:402:0x05f6, B:406:0x05fd, B:408:0x0616, B:410:0x0625, B:414:0x0639, B:415:0x0646, B:419:0x0650, B:422:0x0657, B:421:0x0661, B:412:0x063f, B:430:0x066a, B:432:0x0675, B:434:0x067b, B:436:0x067e, B:441:0x068a, B:442:0x0692, B:444:0x06a3, B:446:0x06b3, B:448:0x06bb, B:449:0x06be, B:450:0x06d1, B:452:0x06d7, B:454:0x06f8, B:461:0x0718, B:463:0x071e, B:465:0x0728, B:467:0x073d, B:469:0x074e, B:471:0x0754, B:473:0x0757, B:478:0x075d, B:479:0x0762, B:483:0x076a, B:486:0x0777, B:488:0x077b, B:490:0x0781, B:492:0x0784, B:495:0x0787, B:497:0x078d, B:503:0x0790, B:505:0x0793, B:507:0x079f, B:508:0x07b8, B:510:0x07bf, B:512:0x07c7, B:514:0x07cd, B:516:0x07d6, B:518:0x07df, B:521:0x081e, B:523:0x0824, B:524:0x082d, B:526:0x0836, B:530:0x084a, B:540:0x0877, B:542:0x0881, B:543:0x088f, B:548:0x07f1, B:551:0x07f7, B:553:0x07ff, B:555:0x0807, B:557:0x0811, B:559:0x0816, B:565:0x0819, B:567:0x07dc, B:573:0x07a9, B:575:0x07af, B:577:0x07b2, B:580:0x07b5, B:584:0x0734, B:586:0x0478, B:239:0x03c1, B:589:0x08a3, B:591:0x08ac, B:592:0x08b5, B:600:0x0902, B:602:0x0924, B:613:0x096d, B:614:0x0973, B:617:0x097b, B:622:0x0a4f, B:633:0x0989, B:634:0x0992, B:636:0x0998, B:639:0x09a3, B:641:0x09aa, B:643:0x09b2, B:645:0x09b9, B:647:0x09bc, B:652:0x09c7, B:654:0x09d1, B:655:0x09d8, B:657:0x09e1, B:660:0x09f7, B:661:0x0a07, B:663:0x0a0c, B:666:0x0a18, B:667:0x0a28, B:668:0x0a2f, B:670:0x0a35, B:672:0x0a3a, B:674:0x0a20, B:679:0x09ff, B:683:0x0a3d, B:693:0x0a96, B:697:0x0abb, B:698:0x0ac4, B:701:0x0ac0, B:5:0x0012), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e0  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.fmd b(defpackage.euf r56, boolean r57, defpackage.euu r58) {
        /*
            Method dump skipped, instructions count: 2790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmd.b(euf, boolean, euu):fmd");
    }
}
