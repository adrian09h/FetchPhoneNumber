
#import "RNFetchPhoneNumber.h"

@implementation RNFetchPhoneNumber

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(getPhoneNumber:(RCTResponseSenderBlock)callback) {
    callback(@[@""]);
}

@end
  
