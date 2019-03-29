using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Fetch.Phone.Number.RNFetchPhoneNumber
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNFetchPhoneNumberModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNFetchPhoneNumberModule"/>.
        /// </summary>
        internal RNFetchPhoneNumberModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNFetchPhoneNumber";
            }
        }
    }
}
